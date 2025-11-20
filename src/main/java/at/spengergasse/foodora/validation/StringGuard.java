package at.spengergasse.foodora.validation;

public class StringGuard
{
    public static String stringMin(String txt, int min, String errMessage)
    {
        if(min <= 0 ){return txt;}
        if(txt == null){
            throw new IllegalArgumentException(errMessage == null ? "String kann nicht NULL sein":errMessage);
        }
        txt.trim();
        if(txt.length() < min){
            throw new IllegalArgumentException(errMessage == null ? "String kann nicht veniger als"+min :errMessage);
        }
        return txt;
    }//stringMin

    public static String stringMax(String txt, int max, String errMessage)
    {
        if(max <=0 ){ return txt;}
        if(txt == null){
            throw  new IllegalArgumentException(errMessage == null ? "String kann nicht NULL sein":errMessage);
        }
        txt.trim();
        if(txt.length() > max){
            throw new IllegalArgumentException(errMessage == null ? "String kann nicht mehr als"+max :errMessage);
        }
        return txt;
    }//stringMax

    public static String stringMinMax(String txt, int min, int max,  String errMessage)
    {
        try {
            stringMin(txt, min, errMessage);
            stringMax(txt, max, errMessage);
            return txt.trim();
        }catch (Throwable e){
            throw e;
        }
    }//stringMinMax
}//end Class
