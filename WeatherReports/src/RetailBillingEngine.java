import jdk.swing.interop.SwingInterOpUtils;

public class RetailBillingEngine {
    public static void main(String[] args){
        final double VAT_RATE = 0.075;
        final double DISCOUNT_RATE = 0.08;
        final double DISCOUNT_THRESHOLD =150.00;

        String a1 = "Mechanical keyboard"; double a1Price = 85.50; int a1Qty = 2;
        String a2 = "USB-C"; double a2Price = 34.99; int a2Qty = 1;
        String a3 = "128GB Fast Flash Drive"; double a3Price = 18.75; int a3Qty = 3;

        double a1Total = a1Price * a1Qty;
        double a2Total = a2Price * a2Qty;
        double a3Total = a3Price * a3Qty;
        double grossSubtotal = a1Total + a2Total + a3Total;

        double discount = (grossSubtotal > DISCOUNT_THRESHOLD)
                ? grossSubtotal * DISCOUNT_RATE : 0.0;
        double discountedSubtotal = grossSubtotal - discount;

        double vat = discountedSubtotal * VAT_RATE;
        double finalTotal = discountedSubtotal + vat;
        int totalCents = ((int)(finalTotal * 100));

        System.out.println("+===============================================================+");
        System.out.println("|           APTECH CAMPUS TECH STORE - SALE RECEIPT                 ");
        System.out.println("+================================================================+");
        System.out.printf("%-22s %5s %10s %12s%n","ITEM","QTY", "UNIT", "LINE TOTAL");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-22s %5d %10.2f %12.2f%n",a1, a1Qty, a1Price, a1Total);
        System.out.printf("%-22s %5d %10.2f %12.2f%n", a2, a2Qty, a2Price, a2Total);
        System.out.printf("%-22s %5d %10.2f %12.2f%n",a3, a3Qty,a3Price, a3Total);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-38s $%10.2f%n","Gross Subtotal", grossSubtotal);
        System.out.printf("%-38s $%10.2f%n","Promotional Discount (8%)", discount);
        System.out.printf("%-38s $%10.2f%n","Subtotal After Discount", discountedSubtotal);
        System.out.printf("%-38s $%10.2f%n","VAT (7.5%)",vat);
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-38s $%10.2f%n", "FINAL INVOICE TOTAL", finalTotal);
        System.out.printf("%-38s %11d%n", "Total in whole cents (int cast)", totalCents);
        System.out.println("+================================================================+");

    }
}
