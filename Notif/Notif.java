public class Notif {

    public static void main(String[] args) {
        String emailPenerima = "ilham.alfajar_ti21@gmail.com";
        String nomerHp = "+6285860979884";
        String mobileId = "android-Realme7";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Update Game Terbaru Hanya di Game Store.....!";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
