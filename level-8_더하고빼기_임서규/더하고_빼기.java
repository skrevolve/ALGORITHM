// public static void main(String[] args) {

// 	Scanner sc = new Scanner(System.in);
// 	System.out.println("숫자를 입력하세요.(10~10000)\n입력:");
// 	int n = sc.nextInt();

// 	if(n > 10000) {
// 		System.err.print("잘못된 입력입니다.다시입력해주세요\n입력:");
// 		n = sc.nextInt();
// 		input(n+1);
// 		sc.close();
// 	}else {
// 		input(n+1);
// 		sc.close();
// 	}
			
			
// }
		
// public static void input(int limit) {
			
// 	for(int i=1; i<limit; i++) {
// 		if((i%9)==0) {
// 			System.out.println(i+"-apple");
// 		}
// 		if(i==1||i==3||i==24||i==26||i==47||i==49||i==68||i==70||i==91||i==93) {
// 			System.out.println(i+"-kiwi");
// 		}
// 		if(i==2||i==21||i==23||i==42||i==44||i==46||i==65||i==67||i==69||i==88) {
// 			System.out.println(i+"-pear");
// 		}
// 		if(i==4||i==6||i==25||i==29||i==48||i==50||i==71||i==73||i==92||i==94||i==96) {
// 			System.out.println(i+"-banana");
// 		}
// 		if(i==5||i==7||i==28||i==30||i==32||i==51||i==53||i==74||i==76||i==95||i==97) {
// 			System.out.println(i+"-melon");
// 		}
// 		if(i==8||i==10||i==12||i==31||i==33||i==52||i==54||i==56||i==75||i==77||i==79||i==98||i==100) {
// 			System.out.println(i+"-pineapple");
// 		}
// 		if(i==11||i==13||i==34||i==55||i==57||i==59||i==78||i==80) {
// 			System.out.println(i+"-cucumber");
// 		}
// 		if(i==14||i==16||i==35||i==37||i==39||i==58||i==60||i==83) {
// 			System.out.println(i+"-orange");
// 		}
// 		if(i==15||i==17||i==19||i==38||i==40||i==61||i==82||i==84||i==86) {
// 			System.out.println(i+"-grape");
// 		}
// 		if(i==20||i==22||i==41||i==43||i==62||i==64||i==66||i==85||i==87||i==89) {
// 			System.out.println(i+"-cherry");
// 		}
// 	}
// }

public static void input(int limit) {
	if(limit >=10 && limit <= 10000) {
    	for(int i=1; i<100; i++) {
    		if((i%9)==0) {
    			System.out.println(i+"-apple");
    		}
    	}
	}
}
