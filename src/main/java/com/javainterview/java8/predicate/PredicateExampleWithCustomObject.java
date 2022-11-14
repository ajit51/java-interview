package com.javainterview.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleWithCustomObject {

    public static void main(String[] args) {
        Predicate<Person> predicate = (p) -> p.getAge() > 30;
        boolean result = predicate.test(new Person("Ramesh", 30));
        System.out.println(result);

        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> list = Arrays.asList(new Hosting[]{h1, h2, h3, h4});
        List<Hosting> hostings = HostingRespository.filterHosting(list, x -> x.getName().startsWith("l"));
        System.out.println(hostings);
        List<Hosting> hostings1 = HostingRespository.filterHosting(list, isDeveloperFriendly());
        System.out.println(hostings1);
    }

    public static Predicate<Hosting> isDeveloperFriendly() {
        return n -> n.getName().equals("linode");
    }
}
