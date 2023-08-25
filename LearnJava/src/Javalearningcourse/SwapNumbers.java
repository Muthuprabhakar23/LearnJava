package Javalearningcourse;

public class SwapNumbers {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with 3rd variables

		int subcriberscount = 100;
		int myfriendsubscriberscount =1000;
		int temp= subcriberscount;
		subcriberscount=myfriendsubscriberscount;
		myfriendsubscriberscount=temp;
				System.out.println(" Now my subcribers count is " + subcriberscount
						+ " my frined subcribers count is " + myfriendsubscriberscount );

		//without 3rd variables
		int first =50;
		int second =60;
		first=first-second;//50-30=20//-10
		second=first+second;//20+30=50//50
		first=second-first;//50-20=30//50-(-10)

		System.out.println("first is " + first + " second is " + second);

	}

}
