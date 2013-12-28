/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.drive;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class InsertGoogleDrive { //adicione aqui o CLIENT_ID que nós criamos 

    private static final String CLIENT_ID = "295001421562-ehmp2uojlukkijg8b4o2f82vf918q0qs.apps.googleusercontent.com"; //adicione aqui o CLIENT_SECRET que nós criamos 
    private static final String CLIENT_SECRET = "JGsBQKJiToHV1LoRdYA6pi7l"; //a REDIRECT_URI vai ser a mesma sempre (provavelmente) 
    private static final String REDIRECT_URI = "urn:ietf:wg:oauth:2.0:oob";
    //email: 
    //senha: 

    public void EnviaBackup(String caminho) throws IOException {
        HttpTransport httpTransport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                httpTransport, jsonFactory, CLIENT_ID, CLIENT_SECRET, Arrays.asList(DriveScopes.DRIVE))
                .setAccessType("online")
                .setApprovalPrompt("auto").build();

        String url = flow.newAuthorizationUrl().setRedirectUri(REDIRECT_URI).build();

        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(url);
            desktop.browse(uri);
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        String code = JOptionPane.showInputDialog("Digite o código gerado pelo Google Drive: ", "insira o código aqui...");

        GoogleTokenResponse response = flow.newTokenRequest(code).setRedirectUri(REDIRECT_URI).execute();
        GoogleCredential credential = new GoogleCredential().setFromTokenResponse(response);

        //Create a new authorized API client
        Drive service = new Drive.Builder(httpTransport, jsonFactory, credential).build();

        //inserindo o arquivo no google drive, ou seja, mostrando quais serão seus titulos, descrição e etc no GD
        File body = new File();
        body.setTitle("Backup");
        body.setDescription("Arquivo de backup - Cella");
        body.setMimeType("text/plain");

        java.io.File fileContent = new java.io.File(caminho);

        FileContent mediaContent = new FileContent("text/plain", fileContent);

        try {
            Drive.Files.Insert request = service.files().insert(body, mediaContent);

            request.getMediaHttpUploader().setDirectUploadEnabled(true);

            request.execute();
            JOptionPane.showMessageDialog(null, "Gravação online efetuada com sucesso.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Causa: \b" + e,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
