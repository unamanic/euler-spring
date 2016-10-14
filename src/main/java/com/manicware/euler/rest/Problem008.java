package com.manicware.euler.rest;

import com.codepoetics.protonpack.StreamUtils;
import com.manicware.euler.rest.response.Answer;
import com.manicware.euler.util.Prime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by unamanic on 10/9/16.
 */
@RestController
@RequestMapping("/problem008")
@Qualifier("Problem008")
public class Problem008 implements Problem {

    private static final Logger log = LoggerFactory.getLogger(Problem008.class);

    private static final String QUESTION = "The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.\n" +
            "\n" +
            "73167176531330624919225119674426574742355349194934\n" +
            "96983520312774506326239578318016984801869478851843\n" +
            "85861560789112949495459501737958331952853208805511\n" +
            "12540698747158523863050715693290963295227443043557\n" +
            "66896648950445244523161731856403098711121722383113\n" +
            "62229893423380308135336276614282806444486645238749\n" +
            "30358907296290491560440772390713810515859307960866\n" +
            "70172427121883998797908792274921901699720888093776\n" +
            "65727333001053367881220235421809751254540594752243\n" +
            "52584907711670556013604839586446706324415722155397\n" +
            "53697817977846174064955149290862569321978468622482\n" +
            "83972241375657056057490261407972968652414535100474\n" +
            "82166370484403199890008895243450658541227588666881\n" +
            "16427171479924442928230863465674813919123162824586\n" +
            "17866458359124566529476545682848912883142607690042\n" +
            "24219022671055626321111109370544217506941658960408\n" +
            "07198403850962455444362981230987879927244284909188\n" +
            "84580156166097919133875499200524063689912560717606\n" +
            "05886116467109405077541002256983155200055935729725\n" +
            "71636269561882670428252483600823257530420752963450\n" +
            "\n" +
            "Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?";

    @Override
    @RequestMapping("/")
    public Answer getQuestion() {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        return answer;
    }

    String number = "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

    @Override
    @RequestMapping("/{limit}")
    public Answer doProblem(@PathVariable long limit) {
        Answer answer = new Answer();
        answer.setQuestion(QUESTION);
        long start = new Date().getTime();

        Stream<Character> characterStream = number.chars().mapToObj(p -> (char)p);

        BigInteger max =
                StreamUtils.windowed(characterStream, (int)limit)
                        .map(p -> p.stream()
                                .map(m -> new BigInteger(String.valueOf(m)))
                                .reduce(BigInteger.ONE, BigInteger::multiply))
                        .max(Comparator.naturalOrder()).get();

        answer.setAnswer(max.toString());

        answer.setTime(new Date().getTime() - start);
        return answer;
    }
}
