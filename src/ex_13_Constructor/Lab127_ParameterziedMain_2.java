package ex_13_Constructor;

public class Lab127_ParameterziedMain_2 {
    public static void main(String[] args) {
        Lab126_ParameterizedConstructor_2 tata = new Lab126_ParameterizedConstructor_2("Tata",2019);
        System.out.println(tata.model);
        System.out.println(tata.year);

        Lab126_ParameterizedConstructor_2 hyundai = new Lab126_ParameterizedConstructor_2("i20",2016);
        System.out.println(hyundai.model);
        System.out.println(hyundai.year);
    }
}
