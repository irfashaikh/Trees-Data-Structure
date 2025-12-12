// import java.util.Scanner;

// class test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int K = sc.nextInt();
//         int[] solutions = new int[K];
//         for(int i=0; i<K; i++){
//             solutions[i] = sc.nextInt();
//         }
//         int sol = (solutions[0]+solutions[1])%100;
//         int pre1 = (solutions[0] * solutions[1]);
//         for(int i=2; i<K; i++){
//             int sol2 = (sol + solutions[i])%100;
//             pre1 =pre1+( sol2 * sol)%100;
//         }
//         sol = (solutions[K-1]+solutions[K-2])%100;
//         int pre2 = (solutions[K-1] * solutions[K-2]);
//         for(int i=K-3; i>=0; i--){
//             int sol2 = (sol + solutions[i])%100;
//             pre2 = pre2+(sol*solutions[i]);
//         }
//         System.out.println(Math.min(pre1,pre2));
//     }
// }