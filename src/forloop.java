
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int v=8;v>0;v--) {
        	for(int d=13;d>0;d--) {
        		if(d==(v-1)|d==(v-13) ) {
        			System.out.print(" * ");
        		}
        		else {
        			System.out.print("  ");

                  }
        	}
        	System.out.println();
                  }
		System.out.println();
		for(int a=0; a<7;a++) {
			for(int b=0;b<7;b++) {
				if(a==0|a==6) {
					System.out.print(" z ");
				}else if(b==(6-a)) {
					System.out.print(" z ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int c=0;c<5;c++) {
			for(int d=0;d<5;d++) {
				if(d==0|d==4) {
					System.out.print(" a ");
				}else if(d==(c)) {
					System.out.print(" N ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		for(int e=7;e>0;e--) {
			for(int f=0;f<7;f++) {
				if(f==(e-1)) {
					System.out.print(" a ");
				}
			}
		}
		
		
	}
	
}