import java.lang.Math.*
import java.util.*

fun main() {

    var score1: Int;
    var score2: Int;
    var winscore: Int;
    var mscore: Int;
    var sscore: Int;

    val scan: Scanner = Scanner(System.`in`);

    winscore = scan.nextInt();
    score1 = scan.nextInt();
    score2 = scan.nextInt();

    if (score1 >= score2) {
        mscore = score1;
        sscore = score2;
    } else {
        mscore = score2;
        sscore = score1;
    };
    //println("$score1 $score2 $winscore")
    //mscore = Muchnumber(score1, score2)
    //println(Muchnumber(score1, score2));
    var count: Int = 0;
    while ((abs(mscore - sscore) < 2) || (mscore < winscore)) {
        //println(abs(mscore - sscore));
        mscore = mscore + 1;
        count += 1;
    }
    //println(mscore);
    println(count);


}
