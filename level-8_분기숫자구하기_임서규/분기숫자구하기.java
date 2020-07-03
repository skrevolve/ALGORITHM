public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1~12월 중 입력하세요.");
	int n = sc.nextInt();
		if(n > 12 || n < 1) {
		System.err.print("잘못된 입력입니다.다시입력해주세요\n입력:");
		n = sc.nextInt();
		input(n);
		sc.close();
	}else {
		input(n);
		sc.close();
	}
	
	
}
		
public static void input(int n) {
		if(n==1||n==2||n==3) {
			System.out.println(n+" => "+"1");
		}
		if(n==4||n==5||n==6) {
			System.out.println(n+" => "+"2");
		}
		if(n==7||n==8||n==9) {
			System.out.println(n+" => "+"3");
		}
		if(n==10||n==11||n==12) {
			System.out.println(n+" => "+"4");
		}
}
