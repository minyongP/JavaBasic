package test2;

public class TV {

   public int yearOfProduction, inch;
   public String company;
   
   public TV(String company, int yearOfProduction, int inch) {      // TV 객체 구성
      this.company = company;
      this.yearOfProduction = yearOfProduction;
      this.inch = inch;
   }
   
   public String info(){               //TV 정보 출력
      return company + "에서 만든 " + yearOfProduction + "년형 " + inch + "인치 TV";
   }
   
   public static void main(String[] args) {
         TV myTV = new TV("LG", 2020, 55); // TV 객체 생성
         System.out.println(myTV.info());
      }
}