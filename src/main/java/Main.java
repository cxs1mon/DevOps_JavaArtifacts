import org.example.theModule.LengthConverter;
import org.example.theModule.LengthUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(Text.hello());
        System.out.println(LengthConverter.convert(20, LengthUnit.FOOT, LengthUnit.YARD));

    }
}
