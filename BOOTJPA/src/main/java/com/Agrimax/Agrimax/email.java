package com.Agrimax.Agrimax;



import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email {

    public static void emailSend(contactUs contact) {
        // ... (existing code remains the same)

        try {
            // Send email to recipient
            sendEmailToRecipient(contact);

            // Send confirmation email to sender
            sendConfirmationEmail(contact);

            System.out.println("Emails sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Failed to send emails.");
        }
    }

    private static void sendEmailToRecipient(contactUs contact) throws MessagingException {
	    
        final String senderEmail = "agrimax.business@gmail.com";
        final String senderPassword = "yzgxkuzxmgpmqcos";
        final String recipientEmail = contact.email;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Contact Us Form Submission");
         // HTML content for the confirmation email

            
            String htmlContent = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" lang=\"en\">" +
            	    "<head>" +
            	    "<title></title>" +
            	    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">" +
            	    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><!--[if mso]><xml><o:OfficeDocumentSettings><o:PixelsPerInch>96</o:PixelsPerInch><o:AllowPNG/></o:OfficeDocumentSettings></xml><![endif]-->" +
            	    "<style>" +
            	    "* {box-sizing: border-box;}" +
            	    "body {margin: 0; padding: 0;}" +
            	    "a[x-apple-data-detectors] {color: inherit !important; text-decoration: inherit !important;}" +
            	    "#MessageViewBody a {color: inherit; text-decoration: none;}" +
            	    "p {line-height: inherit}" +
            	    ".desktop_hide, .desktop_hide table {mso-hide: all; display: none; max-height: 0px; overflow: hidden;}" +
            	    ".image_block img+div {display: none;}" +
            	    "@media (max-width:700px) {.desktop_hide table.icons-inner {display: inline-block !important;}.icons-inner {text-align: center;}.icons-inner td {margin: 0 auto;}.social_block.desktop_hide .social-table {display: inline-block !important;}.row-content {width: 100% !important;}.stack .column {width: 100%; display: block;}.mobile_hide {max-width: 0; min-height: 0; max-height: 0; font-size: 0; display: none; overflow: hidden;}.desktop_hide, .desktop_hide table {max-height: none !important; display: table !important;}.row-7 .column-1 {padding: 5px 5px 5px 0 !important;}}" +
            	    "</style>" +
            	    "</head>" +
            	    "<body style=\"text-size-adjust: none; background-color: #e7ebe7; margin: 0; padding: 0;\">" +
            	    "<table class=\"nl-container\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #e7ebe7;\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td>" +
            	    "<table class=\"row row-1\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td>" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-top: 3px solid #000000; vertical-align: top; border-right: 0px; border-bottom: 0px;\">" +
            	    "<div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>" +
            	    "</td>" +
            	    "<td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-top: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-right: 0px; border-bottom: 0px; border-left: 0px;\">" +
            	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\" style=\"width:100%;\">" +
            	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://5c83ccac50.imgdist.com/public/users/Integrators/BeeProAgency/1025828_1010794/Picture1.png\" style=\"height: auto; display: block; border: 0; max-width: 453.3333333333333px; width: 100%;\" width=\"453.3333333333333\"></div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "</td>" +
            	    "<td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; border-top: 3px solid #000000; vertical-align: top; border-bottom: 0px; border-left: 0px;\">" +
            	    "<div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "<table class=\"row row-2\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td>" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; width: 680px; margin: 0 auto;\" width=\"680\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td class=\"column column-1\" width=\"50%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #0cee0c; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">" +
            	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\" style=\"width:100%;\">" +
            	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://yieldpro.com/wp-content/uploads/2018/04/Message-received.jpg\" style=\"height: auto; display: block; border: 0; max-width: 337px; width: 100%;\" width=\"337\"></div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "</td>" +
            	    "<td class=\"column column-2\" width=\"50%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #62e862; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">" +
            	    "<div class=\"spacer_block block-1\" style=\"height:30px;line-height:30px;font-size:1px;\">&#8202;</div>" +
            	    "<table class=\"text_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\" style=\"padding-bottom:25px;padding-left:20px;padding-right:20px;padding-top:10px;\">" +
            	    "<div style=\"font-family: Georgia, 'Times New Roman', serif\">" +
            	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 16.8px; color: #2f2f2f; line-height: 1.2;\">" +
            	    "<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 16.8px;\"><span style=\"font-size:34px;\">Your Message has been Received!</span></p>" +
            	    "</div>" +
            	    "</div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "<table class=\"divider_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\">" +
            	    "<div class=\"alignment\" align=\"center\">" +
            	    "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"5%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tr>" +
            	    "<td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 3px solid #2F2F2F;\"><span>&#8202;</span></td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "</div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "<div class=\"spacer_block block-4\" style=\"height:16px;line-height:16px;font-size:1px;\">&#8202;</div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "<table class=\"row row-3\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td>" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">" +
            	    "<tbody>" +
            	    "<tr>" +
            	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 20px; padding-top: 40px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">" +
            	    "<table class=\"heading_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">" +
            	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 24px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Dear "+contact.fname+",</strong></h3>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "<table class=\"text_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">" +
            	    "<tr>" +
            	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:30px;padding-top:10px;\">" +
            	    "<div style=\"font-family: sans-serif\">" +
            	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">" +
            	    "<p style=\"margin: 0; font-size: 16px; text-align: left; mso-line-height-alt: 24px;\">Thank you for Contacting us. We have received your message and will get back to you shortly.</p>" +
            	    "</div>" +
            	    "</div>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</table>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "</td>" +
            	    "</tr>" +
            	    "</tbody>" +
            	    "</table>" +
            	    "<table class=\"row row-4\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\"></table>\n" +
            	    "<tbody>\n" +
            	    "    <tr>\n" +
            	    "        <td>\n" +
            	    "            <table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
            	    "                <tbody>\n" +
            	    "                    <tr>\n" +
            	    "                        <td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
            	    "                            <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
            	    "                        </td>\n" +
            	    "                        <td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #2fc415; border-left: 3px solid #025702; border-right: 3px solid #025702; border-top: 3px solid #025702; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-bottom: 0px;\">\n" +
            	    "                            <table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"20\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "                                <tr>\n" +
            	    "                                    <td class=\"pad\">\n" +
            	    "                                        <div style=\"font-family: sans-serif\">\n" +
            	    "                                            <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 16.8px; color: #ffffff; line-height: 1.2;\">\n" +
            	    "                                                <p style=\"margin: 0; text-align: center; mso-line-height-alt: 16.8px;\"><span style=\"font-size:22px;\">Summary of Your Enquiry</span></p>\n" +
            	    "                                            </div>\n" +
            	    "                                        </div>\n" +
            	    "                                    </td>\n" +
            	    "                                </tr>\n" +
            	    "                            </table>\n" +
            	    "                        </td>\n" +
            	    "                        <td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
            	    "                            <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
            	    "                        </td>\n" +
            	    "                    </tr>\n" +
            	    "                </tbody>\n" +
            	    "            </table>\n" +
            	    "        </td>\n" +
            	    "    </tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "<table class=\"row row-5\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "    <tbody>\n" +
            	    "        <tr>\n" +
            	    "            <td>\n" +
            	    "                <table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
            	    "                    <tbody>\n" +
            	    "                        <tr>\n" +
            	    "                            <td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
            	    "                                <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
            	    "                            </td>\n" +
            	    "                            <td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-bottom: 3px solid #025702; border-left: 3px solid #025702; border-right: 3px solid #025702; border-top: 3px solid #025702; padding-bottom: 5px; padding-top: 5px; vertical-align: top;\">\n" +
            	    "                                <table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "                                    <tr>\n" +
            	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
            	    "                                            <div style=\"font-family: sans-serif\">\n" +
            	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
            	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Name:</span></strong> " + contact.fname + " " + contact.lname + "</span></p>\n" +
            	    "                                                </div>\n" +
            	    "                                            </div>\n" +
            	    "                                        </td>\n" +
            	    "                                    </tr>\n" +
            	    "                                </table>\n" +
            	    "                                <table class=\"divider_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                                    <tr>\n" +
            	    "                                        <td class=\"pad\">\n" +
            	    "                                            <div class=\"alignment\" align=\"center\">\n" +
            	    "                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                                                    <tr>\n" +
            	    "                                                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
            	    "                                                    </tr>\n" +
            	    "                                                </table>\n" +
            	    "                                            </div>\n" +
            	    "                                        </td>\n" +
            	    "                                    </tr>\n" +
            	    "                                </table>\n" +
            	    "                                <table class=\"text_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "                                    <tr>\n" +
            	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
            	    "                                            <div style=\"font-family: sans-serif\">\n" +
            	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
            	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Email:</span></strong> "+contact.email+"</span></p>\n" +
            	    "                                                </div>\n" +
            	    "                                            </div>\n" +
            	    "                                        </td>\n" +
            	    "                                    </tr>\n" +
            	    "                                </table>\n" +
            	    "                                <table class=\"divider_block block-4\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                                    <tr>\n" +
            	    "                                        <td class=\"pad\">\n" +
            	    "                                            <div class=\"alignment\" align=\"center\">\n" +
            	    "                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                                                    <tr>\n" +
            	    "                                                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
            	    "                                                    </tr>\n" +
            	    "                                                </table>\n" +
            	    "                                            </div>\n" +
            	    "                                        </td>\n" +
            	    "                                    </tr>\n" +
            	    "                                </table>\n" +
            	    "                                <table class=\"text_block block-5\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "                                    <tr>\n" +
            	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
            	    "                                            <div style=\"font-family: sans-serif\">\n" +
            	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
            	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Contact:</span></strong> "+ contact.phoneNumber +"</span></p>\n" +
            	    "                                                </div>\n" +
            	    "                                            </div>\n" +
            	    "                                        </td>\n" +
            	    "                                    </tr>\n" +
            	    "                                </table>\n" +
            	    "<table class=\"divider_block block-6\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "    <tr>\n" +
            	    "        <td class=\"pad\">\n" +
            	    "            <div class=\"alignment\" align=\"center\">\n" +
            	    "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                    <tr>\n" +
            	    "                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
            	    "                    </tr>\n" +
            	    "                </table>\n" +
            	    "            </div>\n" +
            	    "        </td>\n" +
            	    "    </tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"text_block block-7\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "    <tr>\n" +
            	    "        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
            	    "            <div style=\"font-family: sans-serif\">\n" +
            	    "                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
            	    "                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Message:</span></strong> "+ contact.message +".</span></p>\n" +
            	    "                </div>\n" +
            	    "            </div>\n" +
            	    "        </td>\n" +
            	    "    </tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"divider_block block-8\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "    <tr>\n" +
            	    "        <td class=\"pad\">\n" +
            	    "            <div class=\"alignment\" align=\"center\">\n" +
            	    "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "                    <tr>\n" +
            	    "                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
            	    "                    </tr>\n" +
            	    "                </table>\n" +
            	    "            </div>\n" +
            	    "        </td>\n" +
            	    "    </tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"text_block block-9\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "    <tr>\n" +
            	    "        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
            	    "            <div style=\"font-family: sans-serif\">\n" +
            	    "                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
            	    "                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Selected Subject :</span></strong> "+contact.selectSubject +".</span></p>\n" +
            	    "                </div>\n" +
            	    "            </div>\n" +
            	    "        </td>\n" +
            	    "    </tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "<td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
            	    "    <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "<table class=\"row row-6\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td>\n" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">\n" +
            	    "<table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:30px;padding-top:10px;\">\n" +
            	    "<div style=\"font-family: sans-serif\">\n" +
            	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #2f2f2f; line-height: 1.5;\">\n" +
            	    "<p style=\"margin: 0; font-size: 16px; text-align: left; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;color:#5d77a9;\">Need to make changes in the message?</span></p>\n" +
            	    "</div>\n" +
            	    "</div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "<table class=\"row row-7\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td>\n" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td class=\"column column-1\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
            	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\">\n" +
            	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"tel:+917822941461\" style=\"height:42px;width:176px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"tel:+917822941461\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"word-break: break-word; line-height: 32px;\">Contact Us Via Call</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "<td class=\"column column-2\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">\n" +
            	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\">\n" +
            	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"mailto:agrimax.business@gmail.com?subject=Regarding%20Change%20of%20Message&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" style=\"height:42px;width:190px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"mailto:agrimax.business@gmail.com?subject=Regarding%20Change%20of%20Message&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"margin: 0; word-break: break-word; line-height: 32px;\">Contact Us Via Email</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "<td class=\"column column-3\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
            	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\">\n" +
            	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"sms:+917822941461;?&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" style=\"height:42px;width:181px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"sms:+917822941461;?&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"margin: 0; word-break: break-word; line-height: 32px;\">Contact Us Via SMS</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>"+
            	    "<table class=\"row row-8\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td>\n" +
            	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
            	    "<tbody>\n" +
            	    "<tr>\n" +
            	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-bottom: 3px solid #000000; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px;\">\n" +
            	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\" style=\"width:100%;padding-right:0px;padding-left:0px;\">\n" +
            	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://5c83ccac50.imgdist.com/public/users/Integrators/BeeProAgency/1025828_1010794/Picture1.png\" style=\"height: auto; display: block; border: 0; max-width: 202.2px; width: 100%;\" width=\"202.2\" alt=\"Yourlogo Light\" title=\"Yourlogo Light\"></div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"paragraph_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\">\n" +
            	    "<div style=\"color:#101112;direction:ltr;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;font-weight:400;letter-spacing:0px;line-height:120%;text-align:center;mso-line-height-alt:19.2px;\">\n" +
            	    "<p style=\"margin: 0;\"><strong>©2023&nbsp;</strong>Agrimax Indian Agriculture Private</p>\n" +
            	    "</div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"social_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\">\n" +
            	    "<div class=\"alignment\" align=\"center\">\n" +
            	    "<table class=\"social-table\" width=\"72px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; display: inline-block;\">\n" +
            	    "<tr>\n" +
            	    "<td style=\"padding:0 2px 0 2px;\"><a href target=\"_blank\"><img src=\"https://app-rsrc.getbee.io/public/resources/social-networks-icon-sets/colored/whatsapp@2x.png\" width=\"32\" height=\"32\" alt=\"WhatsApp\" title=\"WhatsApp\" style=\"height: auto; display: block; border: 0;\"></a></td>\n" +
            	    "<td style=\"padding:0 2px 0 2px;\"><a href=\"mailto:agrimax.business@gmail.com\" target=\"_blank\"><img src=\"https://app-rsrc.getbee.io/public/resources/social-networks-icon-sets/colored/mail@2x.png\" width=\"32\" height=\"32\" alt=\"E-Mail\" title=\"E-Mail\" style=\"height: auto; display: block; border: 0;\"></a></td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</div>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"heading_block block-4\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">\n" +
            	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 18px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Best Regards,</strong></h3>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "<table class=\"heading_block block-5\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
            	    "<tr>\n" +
            	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">\n" +
            	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 18px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Team Agrimax</strong></h3>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</td>\n" +
            	    "</tr>\n" +
            	    "</tbody>\n" +
            	    "</table>\n" +
            	    "</body>\n" +
            	    "</html>";

            	// The rest of the HTML code is omitted for brevity.



            // Set the HTML content as the message body
            message.setContent(htmlContent, "text/html");

            // Send the confirmation email
            Transport.send(message);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Failed to send email.");
        }
    }

    private static void sendConfirmationEmail(contactUs contact) throws MessagingException {
       
    	final String senderEmail = "agrimax.business@gmail.com";
        final String senderPassword = "yzgxkuzxmgpmqcos";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(senderEmail)); // Send to the sender's email
        message.setSubject("Contact Us Form Submission");
     // HTML content for the confirmation email
        String htmlContent = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" lang=\"en\">" +
        	    "<head>" +
        	    "<title></title>" +
        	    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">" +
        	    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><!--[if mso]><xml><o:OfficeDocumentSettings><o:PixelsPerInch>96</o:PixelsPerInch><o:AllowPNG/></o:OfficeDocumentSettings></xml><![endif]-->" +
        	    "<style>" +
        	    "* {box-sizing: border-box;}" +
        	    "body {margin: 0; padding: 0;}" +
        	    "a[x-apple-data-detectors] {color: inherit !important; text-decoration: inherit !important;}" +
        	    "#MessageViewBody a {color: inherit; text-decoration: none;}" +
        	    "p {line-height: inherit}" +
        	    ".desktop_hide, .desktop_hide table {mso-hide: all; display: none; max-height: 0px; overflow: hidden;}" +
        	    ".image_block img+div {display: none;}" +
        	    "@media (max-width:700px) {.desktop_hide table.icons-inner {display: inline-block !important;}.icons-inner {text-align: center;}.icons-inner td {margin: 0 auto;}.social_block.desktop_hide .social-table {display: inline-block !important;}.row-content {width: 100% !important;}.stack .column {width: 100%; display: block;}.mobile_hide {max-width: 0; min-height: 0; max-height: 0; font-size: 0; display: none; overflow: hidden;}.desktop_hide, .desktop_hide table {max-height: none !important; display: table !important;}.row-7 .column-1 {padding: 5px 5px 5px 0 !important;}}" +
        	    "</style>" +
        	    "</head>" +
        	    "<body style=\"text-size-adjust: none; background-color: #e7ebe7; margin: 0; padding: 0;\">" +
        	    "<table class=\"nl-container\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #e7ebe7;\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td>" +
        	    "<table class=\"row row-1\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td>" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-top: 3px solid #000000; vertical-align: top; border-right: 0px; border-bottom: 0px;\">" +
        	    "<div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>" +
        	    "</td>" +
        	    "<td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-top: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-right: 0px; border-bottom: 0px; border-left: 0px;\">" +
        	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\" style=\"width:100%;\">" +
        	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://5c83ccac50.imgdist.com/public/users/Integrators/BeeProAgency/1025828_1010794/Picture1.png\" style=\"height: auto; display: block; border: 0; max-width: 453.3333333333333px; width: 100%;\" width=\"453.3333333333333\"></div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "</td>" +
        	    "<td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; border-top: 3px solid #000000; vertical-align: top; border-bottom: 0px; border-left: 0px;\">" +
        	    "<div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "<table class=\"row row-2\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td>" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; width: 680px; margin: 0 auto;\" width=\"680\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td class=\"column column-1\" width=\"50%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #0cee0c; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">" +
        	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\" style=\"width:100%;\">" +
        	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://yieldpro.com/wp-content/uploads/2018/04/Message-received.jpg\" style=\"height: auto; display: block; border: 0; max-width: 337px; width: 100%;\" width=\"337\"></div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "</td>" +
        	    "<td class=\"column column-2\" width=\"50%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #62e862; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">" +
        	    "<div class=\"spacer_block block-1\" style=\"height:30px;line-height:30px;font-size:1px;\">&#8202;</div>" +
        	    "<table class=\"text_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\" style=\"padding-bottom:25px;padding-left:20px;padding-right:20px;padding-top:10px;\">" +
        	    "<div style=\"font-family: Georgia, 'Times New Roman', serif\">" +
        	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 16.8px; color: #2f2f2f; line-height: 1.2;\">" +
        	    "<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 16.8px;\"><span style=\"font-size:34px;\">Your Message has been Received!</span></p>" +
        	    "</div>" +
        	    "</div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "<table class=\"divider_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\">" +
        	    "<div class=\"alignment\" align=\"center\">" +
        	    "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"5%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tr>" +
        	    "<td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 3px solid #2F2F2F;\"><span>&#8202;</span></td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "</div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "<div class=\"spacer_block block-4\" style=\"height:16px;line-height:16px;font-size:1px;\">&#8202;</div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "<table class=\"row row-3\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td>" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">" +
        	    "<tbody>" +
        	    "<tr>" +
        	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 20px; padding-top: 40px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">" +
        	    "<table class=\"heading_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">" +
        	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 24px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Dear "+contact.fname+",</strong></h3>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "<table class=\"text_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">" +
        	    "<tr>" +
        	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:30px;padding-top:10px;\">" +
        	    "<div style=\"font-family: sans-serif\">" +
        	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">" +
        	    "<p style=\"margin: 0; font-size: 16px; text-align: left; mso-line-height-alt: 24px;\">Thank you for Contacting us. We have received your message and will get back to you shortly.</p>" +
        	    "</div>" +
        	    "</div>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</table>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "</td>" +
        	    "</tr>" +
        	    "</tbody>" +
        	    "</table>" +
        	    "<table class=\"row row-4\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\"></table>\n" +
        	    "<tbody>\n" +
        	    "    <tr>\n" +
        	    "        <td>\n" +
        	    "            <table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
        	    "                <tbody>\n" +
        	    "                    <tr>\n" +
        	    "                        <td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
        	    "                            <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
        	    "                        </td>\n" +
        	    "                        <td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; background-color: #2fc415; border-left: 3px solid #025702; border-right: 3px solid #025702; border-top: 3px solid #025702; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-bottom: 0px;\">\n" +
        	    "                            <table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"20\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "                                <tr>\n" +
        	    "                                    <td class=\"pad\">\n" +
        	    "                                        <div style=\"font-family: sans-serif\">\n" +
        	    "                                            <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 16.8px; color: #ffffff; line-height: 1.2;\">\n" +
        	    "                                                <p style=\"margin: 0; text-align: center; mso-line-height-alt: 16.8px;\"><span style=\"font-size:22px;\">Summary of Your Enquiry</span></p>\n" +
        	    "                                            </div>\n" +
        	    "                                        </div>\n" +
        	    "                                    </td>\n" +
        	    "                                </tr>\n" +
        	    "                            </table>\n" +
        	    "                        </td>\n" +
        	    "                        <td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
        	    "                            <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
        	    "                        </td>\n" +
        	    "                    </tr>\n" +
        	    "                </tbody>\n" +
        	    "            </table>\n" +
        	    "        </td>\n" +
        	    "    </tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "<table class=\"row row-5\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "    <tbody>\n" +
        	    "        <tr>\n" +
        	    "            <td>\n" +
        	    "                <table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
        	    "                    <tbody>\n" +
        	    "                        <tr>\n" +
        	    "                            <td class=\"column column-1\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
        	    "                                <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
        	    "                            </td>\n" +
        	    "                            <td class=\"column column-2\" width=\"66.66666666666667%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-bottom: 3px solid #025702; border-left: 3px solid #025702; border-right: 3px solid #025702; border-top: 3px solid #025702; padding-bottom: 5px; padding-top: 5px; vertical-align: top;\">\n" +
        	    "                                <table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "                                    <tr>\n" +
        	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
        	    "                                            <div style=\"font-family: sans-serif\">\n" +
        	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
        	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Name:</span></strong> " + contact.fname + " " + contact.lname + "</span></p>\n" +
        	    "                                                </div>\n" +
        	    "                                            </div>\n" +
        	    "                                        </td>\n" +
        	    "                                    </tr>\n" +
        	    "                                </table>\n" +
        	    "                                <table class=\"divider_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                                    <tr>\n" +
        	    "                                        <td class=\"pad\">\n" +
        	    "                                            <div class=\"alignment\" align=\"center\">\n" +
        	    "                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                                                    <tr>\n" +
        	    "                                                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
        	    "                                                    </tr>\n" +
        	    "                                                </table>\n" +
        	    "                                            </div>\n" +
        	    "                                        </td>\n" +
        	    "                                    </tr>\n" +
        	    "                                </table>\n" +
        	    "                                <table class=\"text_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "                                    <tr>\n" +
        	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
        	    "                                            <div style=\"font-family: sans-serif\">\n" +
        	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
        	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Email:</span></strong> "+contact.email+"</span></p>\n" +
        	    "                                                </div>\n" +
        	    "                                            </div>\n" +
        	    "                                        </td>\n" +
        	    "                                    </tr>\n" +
        	    "                                </table>\n" +
        	    "                                <table class=\"divider_block block-4\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                                    <tr>\n" +
        	    "                                        <td class=\"pad\">\n" +
        	    "                                            <div class=\"alignment\" align=\"center\">\n" +
        	    "                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                                                    <tr>\n" +
        	    "                                                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
        	    "                                                    </tr>\n" +
        	    "                                                </table>\n" +
        	    "                                            </div>\n" +
        	    "                                        </td>\n" +
        	    "                                    </tr>\n" +
        	    "                                </table>\n" +
        	    "                                <table class=\"text_block block-5\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "                                    <tr>\n" +
        	    "                                        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
        	    "                                            <div style=\"font-family: sans-serif\">\n" +
        	    "                                                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
        	    "                                                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Contact:</span></strong> "+ contact.phoneNumber +"</span></p>\n" +
        	    "                                                </div>\n" +
        	    "                                            </div>\n" +
        	    "                                        </td>\n" +
        	    "                                    </tr>\n" +
        	    "                                </table>\n" +
        	    "<table class=\"divider_block block-6\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "    <tr>\n" +
        	    "        <td class=\"pad\">\n" +
        	    "            <div class=\"alignment\" align=\"center\">\n" +
        	    "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                    <tr>\n" +
        	    "                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
        	    "                    </tr>\n" +
        	    "                </table>\n" +
        	    "            </div>\n" +
        	    "        </td>\n" +
        	    "    </tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"text_block block-7\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "    <tr>\n" +
        	    "        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
        	    "            <div style=\"font-family: sans-serif\">\n" +
        	    "                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
        	    "                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Message:</span></strong> "+ contact.message +".</span></p>\n" +
        	    "                </div>\n" +
        	    "            </div>\n" +
        	    "        </td>\n" +
        	    "    </tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"divider_block block-8\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "    <tr>\n" +
        	    "        <td class=\"pad\">\n" +
        	    "            <div class=\"alignment\" align=\"center\">\n" +
        	    "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "                    <tr>\n" +
        	    "                        <td class=\"divider_inner\" style=\"font-size: 1px; line-height: 1px; border-top: 1px solid #BBBBBB;\"><span>&#8202;</span></td>\n" +
        	    "                    </tr>\n" +
        	    "                </table>\n" +
        	    "            </div>\n" +
        	    "        </td>\n" +
        	    "    </tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"text_block block-9\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "    <tr>\n" +
        	    "        <td class=\"pad\" style=\"padding-bottom:10px;padding-left:20px;padding-right:20px;padding-top:10px;\">\n" +
        	    "            <div style=\"font-family: sans-serif\">\n" +
        	    "                <div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #393d47; line-height: 1.5;\">\n" +
        	    "                    <p style=\"margin: 0; font-size: 16px; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;\"><strong><span style=\"color:#5d77a9;\">Selected Subject :</span></strong> "+contact.selectSubject +".</span></p>\n" +
        	    "                </div>\n" +
        	    "            </div>\n" +
        	    "        </td>\n" +
        	    "    </tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "<td class=\"column column-3\" width=\"16.666666666666668%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
        	    "    <div class=\"spacer_block block-1\" style=\"height:5px;line-height:5px;font-size:1px;\">&#8202;</div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "<table class=\"row row-6\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td>\n" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">\n" +
        	    "<table class=\"text_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:30px;padding-top:10px;\">\n" +
        	    "<div style=\"font-family: sans-serif\">\n" +
        	    "<div class style=\"font-size: 14px; font-family: Georgia, Times, 'Times New Roman', serif; mso-line-height-alt: 21px; color: #2f2f2f; line-height: 1.5;\">\n" +
        	    "<p style=\"margin: 0; font-size: 16px; text-align: left; mso-line-height-alt: 24px;\"><span style=\"font-size:16px;color:#5d77a9;\">Need to make changes in the message?</span></p>\n" +
        	    "</div>\n" +
        	    "</div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "<table class=\"row row-7\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td>\n" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td class=\"column column-1\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px;\">\n" +
        	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\">\n" +
        	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"tel:+917822941461\" style=\"height:42px;width:176px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"tel:+917822941461\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"word-break: break-word; line-height: 32px;\">Contact Us Via Call</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "<td class=\"column column-2\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px;\">\n" +
        	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\">\n" +
        	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"mailto:agrimax.business@gmail.com?subject=Regarding%20Change%20of%20Message&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" style=\"height:42px;width:190px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"mailto:agrimax.business@gmail.com?subject=Regarding%20Change%20of%20Message&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"margin: 0; word-break: break-word; line-height: 32px;\">Contact Us Via Email</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "<td class=\"column column-3\" width=\"33.333333333333336%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px; border-bottom: 0px; border-left: 0px;\">\n" +
        	    "<table class=\"button_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\">\n" +
        	    "<div class=\"alignment\" align=\"center\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"sms:+917822941461;?&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" style=\"height:42px;width:181px;v-text-anchor:middle;\" arcsize=\"10%\" stroke=\"false\" fillcolor=\"#3c9049\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Georgia, 'Times New Roman', serif; font-size:16px\"><![endif]--><a href=\"sms:+917822941461;?&body=I%20want%20to%20make%20changes%20in%20the%20SMS.\" target=\"_blank\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#3c9049;border-radius:4px;width:auto;border-top:0px solid transparent;font-weight:undefined;border-right:0px solid transparent;border-bottom:0px solid transparent;border-left:0px solid transparent;padding-top:5px;padding-bottom:5px;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;text-align:center;mso-border-alt:none;word-break:keep-all;\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:normal;\"><span style=\"margin: 0; word-break: break-word; line-height: 32px;\">Contact Us Via SMS</span></span></a><!--[if mso]></center></v:textbox></v:roundrect><![endif]--></div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>"+
        	    "<table class=\"row row-8\" align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td>\n" +
        	    "<table class=\"row-content stack\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000; background-color: #fff; width: 680px; margin: 0 auto;\" width=\"680\">\n" +
        	    "<tbody>\n" +
        	    "<tr>\n" +
        	    "<td class=\"column column-1\" width=\"100%\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; text-align: left; font-weight: 400; border-bottom: 3px solid #000000; border-left: 3px solid #000000; border-right: 3px solid #000000; padding-bottom: 5px; padding-top: 5px; vertical-align: top; border-top: 0px;\">\n" +
        	    "<table class=\"image_block block-1\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\" style=\"width:100%;padding-right:0px;padding-left:0px;\">\n" +
        	    "<div class=\"alignment\" align=\"center\" style=\"line-height:10px\"><img src=\"https://5c83ccac50.imgdist.com/public/users/Integrators/BeeProAgency/1025828_1010794/Picture1.png\" style=\"height: auto; display: block; border: 0; max-width: 202.2px; width: 100%;\" width=\"202.2\" alt=\"Yourlogo Light\" title=\"Yourlogo Light\"></div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"paragraph_block block-2\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\">\n" +
        	    "<div style=\"color:#101112;direction:ltr;font-family:Georgia, Times, 'Times New Roman', serif;font-size:16px;font-weight:400;letter-spacing:0px;line-height:120%;text-align:center;mso-line-height-alt:19.2px;\">\n" +
        	    "<p style=\"margin: 0;\"><strong>©2023&nbsp;</strong>Agrimax Indian Agriculture Private</p>\n" +
        	    "</div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"social_block block-3\" width=\"100%\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\">\n" +
        	    "<div class=\"alignment\" align=\"center\">\n" +
        	    "<table class=\"social-table\" width=\"72px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; display: inline-block;\">\n" +
        	    "<tr>\n" +
        	    "<td style=\"padding:0 2px 0 2px;\"><a href target=\"_blank\"><img src=\"https://app-rsrc.getbee.io/public/resources/social-networks-icon-sets/colored/whatsapp@2x.png\" width=\"32\" height=\"32\" alt=\"WhatsApp\" title=\"WhatsApp\" style=\"height: auto; display: block; border: 0;\"></a></td>\n" +
        	    "<td style=\"padding:0 2px 0 2px;\"><a href=\"mailto:agrimax.business@gmail.com\" target=\"_blank\"><img src=\"https://app-rsrc.getbee.io/public/resources/social-networks-icon-sets/colored/mail@2x.png\" width=\"32\" height=\"32\" alt=\"E-Mail\" title=\"E-Mail\" style=\"height: auto; display: block; border: 0;\"></a></td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</div>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"heading_block block-4\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">\n" +
        	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 18px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Best Regards,</strong></h3>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "<table class=\"heading_block block-5\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\">\n" +
        	    "<tr>\n" +
        	    "<td class=\"pad\" style=\"padding-bottom:10px;padding-left:30px;padding-right:10px;padding-top:10px;text-align:center;width:100%;\">\n" +
        	    "<h3 style=\"margin: 0; color: #066e64; direction: ltr; font-family: Georgia, Times, 'Times New Roman', serif; font-size: 18px; font-weight: 700; letter-spacing: normal; line-height: 120%; text-align: left; margin-top: 0; margin-bottom: 0;\"><strong>Team Agrimax</strong></h3>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</td>\n" +
        	    "</tr>\n" +
        	    "</tbody>\n" +
        	    "</table>\n" +
        	    "</body>\n" +
        	    "</html>";

        	// The rest of the HTML code is omitted for brevity.

        // Set the HTML content as the message body
        message.setContent(htmlContent, "text/html");

        // Send the confirmation email
        Transport.send(message);
    }
}

