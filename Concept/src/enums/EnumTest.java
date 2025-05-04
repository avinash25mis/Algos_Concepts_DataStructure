package enums;

/**
 * @author avinash.a.mishra
 */
public class EnumTest {




public static void main(String[] args)
{

  Color c1 = Color.RED;
  System.out.println(c1);
  System.out.println(c1.equals("RED"));
  System.out.println(c1.equals(Color.RED));
  System.out.println(c1.toString().equals("RED"));

    System.out.println("--------Number----------");

    TheEnum num= TheEnum.NUMBER_5;

    System.out.println(num.equals(TheEnum.NUMBER_5));
    System.out.println(num.getVisibility().equals(5));

    System.out.println(TheEnum.NUMBER_5.getVisibility());

    System.out.println("--------Error Codes----------");


    ErrorCodes error= ErrorCodes.SERVER_ERROR;
    System.out.println(error.getCode().equals(ErrorCodes.SERVER_ERROR.getCode()));
    System.out.println( error.getCode().equals(500));




}





}


