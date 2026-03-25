package com.crud.test.interview.stream.transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionMain {
    public static void main(String[] args) {
        List<Transaction> list = List.of( new Transaction("T1", LocalDate.of(2025,1,1),200.0),
                new Transaction("T1", LocalDate.of(2025,1,1),200.0),
                new Transaction("T2", LocalDate.of(2025,1,2),300.0),
                new Transaction("T3", LocalDate.of(2025,1,3),200.0),
                new Transaction("T4", LocalDate.of(2025,1,2),400.0),
                new Transaction("T5", LocalDate.of(2025,1,1),200.0),
                new Transaction("T6", LocalDate.of(2025,1,3),500.0)
        );

      Map<LocalDate,Double> maps = list.stream()
                .collect(Collectors.groupingBy(Transaction::getTransactionDate,Collectors.summingDouble(Transaction::getTransactionAmount)));
        Map<LocalDate,Double> dd = maps.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(dd);



    }
}
