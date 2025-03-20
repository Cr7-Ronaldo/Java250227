package ex02;

public class FriendTest {

	public static void main(String[] args) {
		Friend[] f = new Friend[5];
		f[0]=new Friend("홍길동","010-5555-5551","@naver.com");
		f[1]=new Friend("감길동","010-5555-5552","@daum.com");
		f[2]=new Friend("배길동","010-5555-5553","@yahoo.com");
		f[3]=new Friend("강길동","010-5555-5554","@nate.com");
		f[4]=new Friend("박길동","010-5555-5555","@facebook.com");
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getInfo());
		}
		

	}

}
