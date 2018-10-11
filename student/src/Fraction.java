import java.util.Scanner;
public class Fraction{
    private int numerator;
    private int denominator;
    public Fraction(){
   
    }
        
    public Fraction(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int ucln(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0){
            return 1;
        } else {
            while (a != b) {                
                if(a > b) a-=b;
                else b -=a;
            }
        }
        return a;
    }
    
    public void rutGon(){
        int uc = ucln(numerator, denominator);
        this.numerator = getNumerator()/uc;
        this.denominator = getDenominator()/uc;
    }
    
   public Fraction add(Fraction operand){
        Fraction tong = new Fraction();
        tong.numerator = this.numerator * operand.getDenominator() + this.denominator * operand.getNumerator();
        tong.denominator = this.denominator * operand.getDenominator();
        tong.rutGon();
        return tong;
    }
   
   public void Xuat(){
       System.out.println(numerator+"/"+ denominator);
   }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       Fraction p1 = new Fraction(a, b);
       Fraction p2 = new Fraction(c, d);
       Fraction tong;
       tong = p1.add(p2);
        tong.Xuat();
    }
}