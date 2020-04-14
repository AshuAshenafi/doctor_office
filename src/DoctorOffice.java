import java.util.Date;

public class DoctorOffice {

        public static void main(String[] args) {

            String patientName = "Stacey Manson";
            boolean hasInsurance = false;
            double temp = 102.2;
            int numVisits = 5;

            double patient_co_pay_amount = 50.00;
            String contact_number = "240 000 0000";

            Date d1 = new Date();
            d1.setDate(29);


            System.out.println("Patient Details:");
            System.out.println("===============================");
            System.out.println("Name: " + patientName);
            System.out.println("Patient has insurance: " + hasInsurance);
            System.out.println("Body temprature: " + temp);
            System.out.println("Number of visits: " + numVisits);

            System.out.println("\n\nPatient co-payment amount is: $" + patient_co_pay_amount);
            System.out.println("Contact number: " + contact_number);
            System.out.println("Next appointment is: " + d1);


        }
}
