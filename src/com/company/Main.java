package com.company;

import java.util.ArrayList;

public class Main {


    ArrayList<block> BlockChain = new ArrayList<>();
    public static void main(String[] args) {
	// Very simple logic to check if hashes of blocks work.
    // If transactions are changed, hashes will change.
        String[] firstTransactions = {"a send 10 to b", "c send 20 to b"};
        String[] secondTransactions = {"b send 10 to a", "b send 20 to c"};
        String[] thirdTransactions = {"b send 15 to a", "b send 15 to c"};

        block genisisBlock = new block(0, firstTransactions);

        block secondBlock = new block(genisisBlock.getBlockHash(), secondTransactions);
        block thirdBlock = new block(secondBlock.getBlockHash(), secondTransactions);

        System.out.println(genisisBlock.getBlockHash());
        System.out.println(secondBlock.getBlockHash());
        System.out.println(thirdBlock.getBlockHash());


    }
}
