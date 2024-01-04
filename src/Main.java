import java.awt.*;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MAH_HA = 12;
        final byte DARSAD = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("مبلغ وام به میلیون تومان: ");
        int mablageVam = input.nextInt();


        System.out.print("سود سالانه : ");
        double soodeSalane = input.nextDouble();
        double darsadeSoodeMahane = soodeSalane / MAH_HA / DARSAD;


        System.out.print("بازپرداخت (به سال) : ");
        int bazPardakht = input.nextInt();
        int aghsat = bazPardakht * MAH_HA;

        double parantez = Math.pow((1+ darsadeSoodeMahane),aghsat);

        double harGhest = mablageVam  * darsadeSoodeMahane * parantez / (parantez-1);

        System.out.println("مبلغ هر قسط" + harGhest + "میلیون تومان");

        double sood = aghsat * harGhest - mablageVam;
        System.out.println("سود وام: " + sood + "میلیون تومان");
    }
}