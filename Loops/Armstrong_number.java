package Loops;
//153= 1*1*1 + 5*5*5+ 3*3*3

class Numbers {
    public static void main(String[] args) {

        int num = 153;
        int copy=num;
        int cpnum = num;
        int rem = 0, cnt = 0;
        while (cpnum != 0) {

            rem = cpnum % 10;
            cnt++;
            cpnum = cpnum / 10;
        }
        rem = 0;
        int mult = 1;
        int sum = 0;
        while (num != 0) {

            rem = num % 10;
            mult = 1;
            for (int i = 1; i <= cnt; i++) {

                mult = mult * rem;
            }
            sum = sum + mult;
            num = num / 10;
        }
        if(sum==copy)
            System.out.println("It is Armstrong number");
    }
}