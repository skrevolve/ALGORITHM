//--------방법1------------------
public static int input(int n) {
	if(n==1||n==2||n==3) {
		return 1;
	}else if(n==4||n==5||n==6) {
		return 2;
	}else if(n==7||n==8||n==9) {
		return 3;
	}else if(n==10||n==11||n==12) {
		return 4;
	}
	return n;
}

//--------방법2------------------
public static int input(int n) {
    int boongi = 0;
    if (1<=n && n<=12){
        boongi = (month+2)/3;
    }
    return boongi;
}
