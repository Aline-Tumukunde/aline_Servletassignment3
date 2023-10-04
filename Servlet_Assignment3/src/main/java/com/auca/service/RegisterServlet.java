package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.*;
import javax.mail.Message.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstname = request.getParameter("firstName");
        String lastname = request.getParameter("lastName");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String mothername = request.getParameter("motherName");
        String fathername = request.getParameter("fatherName");
        String department = request.getParameter("department");
        String certificate = request.getParameter("certificate");
        String picture = request.getParameter("picture");
            PrintWriter out = response.getWriter();
            out.print("<h2>Registration Successful!!</h2>" + email);
        }
    
//
//    public void sendEmail(String userEmail, String ln) throws Exception {
//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
//
//        final String fromEmail = "tumukunde250@gmail.com";
//        final String password = "0780262221";
//
//        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromEmail, password);
//            }
//        });
//        try {
//            Message message = new MimeMessage(session);
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
//            message.setSubject("Confirmation message");
//            String messageBody = "Dear " + ln +  ",\n\nThank you for registering to our site. We have received your information have been taken and will process it as soon as possible.\n\nBest regards,\nThe Form Team";
//            message.setText(messageBody);
//            Transport.send(message);
//            System.out.println("Message sent successfully.");
//       } catch (Exception e) {
//           System.out.println("Error sending message: " + e.getMessage());
//       }
//
//       }
}
