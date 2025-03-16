package Patterns;

public class allpatterns {
    public static void pattern_1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void pattern_4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void pattern_5(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_6(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern_7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern_8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(n-i-1)*2+1;k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern_9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(n-i-1)*2+1;k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern_10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_11(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void pattern_11_alt(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0;j<i+1;j++){
                System.out.print (start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern_12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void pattern_13(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern_14(int n){
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<i+1;j++,c++){
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
    public static void pattern_15(int n){
        for(int i=n;i>0;i--){
            char c='A';
            for(int j=0;j<i;j++,c++){
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
    public static void pattern_16(int n){
        for(int i=0;i<n;i++){
            char c = (char) ('A' + i); 
            for(int j=0;j<i+1;j++){
                System.out.print(c +" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern_17(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<(n-i-1);j++){
            System.out.print(" ");
           }
           char ch='A';
           for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<((2*i+1)/2)+1){
                    ch++;
                }
                else{
                    ch--;
                }
           }
           for(int j=0;j<(n-i-1);j++){
            System.out.print(" ");
           }
            System.out.println();
        }
    }

    public static void pattern_18(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void pattern_19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2 * n - ((i + 1) * 2));j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_20(int n){
        for(int i=0;i<n;i++){
            if(i==n-1){
                break;
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2 * n - ((i + 1) * 2));j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void pattern_20_alternative(int n){
        int space=2*n-2;
        for(int i=1;i<2*n+1;i++){
            int stars=i;
            if(i>n){
                stars= 2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n){
                space-=2;
            }
            else{
                space+=2;
            }
            System.out.println();
        }
    }
    public static void pattern_21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }
                else if(j==0 ||j ==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern_22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top =i;
                int left=j;
                int right=2*n-2-j;
                int bottom = 2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right)));

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern_1(n);
        System.out.println();
        pattern_2(n);
        System.out.println();
        pattern_3(n);
        System.out.println();
        pattern_4(n);
        System.out.println();
        pattern_5(n);
        System.out.println();
        pattern_6(n);
        System.out.println();
        pattern_7(n);
        System.out.println();
        pattern_8(n);
        System.out.println();
        pattern_9(n);
        System.out.println();
        pattern_10(n);
        System.out.println();
        pattern_11(n);
        System.out.println();
        pattern_11_alt(n);
        System.out.println();
        pattern_12(n);
        System.out.println();
        pattern_13(n);
        System.out.println();
        pattern_14(n);
        System.out.println();
        pattern_15(n);
        System.out.println();
        pattern_16(n);
        System.out.println();
        pattern_17(n);
        System.out.println();
        pattern_18(n);
        System.out.println();
        pattern_19(n);
        System.out.println();
        pattern_20(n);
        System.out.println();
        pattern_20_alternative(n);
        System.out.println();
        pattern_21(n);
        System.out.println();
        pattern_22(n);



        
    }
}
