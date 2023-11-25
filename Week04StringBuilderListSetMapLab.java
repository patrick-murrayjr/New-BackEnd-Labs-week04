//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		/* Answer
		 * We would us a StringBuilder  instead of a String because a StringBuilder
		 * is a mutable object and a String is not. Each time you try to modify a string you
		 * need to create a new string and doing this can be a source of memory leaks 
		 */
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            if (i < 9) {
                sb.append("-");
            }
        }
		
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
        List<String> fiveStrings =  new ArrayList<>();
        fiveStrings.add("abc");
        fiveStrings.add("abcd");
        fiveStrings.add("abcde");
        fiveStrings.add("mnopqr");
        fiveStrings.add("ab");

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
        System.out.println("Question 3");
        System.out.println(findShortest(fiveStrings));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
        System.out.println("\nQuestion 4");
        System.out.println(swapFirstAndLastElement(fiveStrings));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
        System.out.println("\nQuestion 5");
        System.out.println(concatenateListOfStrings(fiveStrings));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
        System.out.println("\nQuestion 6");
        System.out.println(filterStringList(fiveStrings, "abc"));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
        List<Integer> intList =  new ArrayList<>();
        for(int i = 1; i<= 15; i++) {
        	intList.add(i);
        }
        System.out.println("\nQuestion 7");
        System.out.println(sortIntegersByFactor(intList));
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
        System.out.println("\nQuestion 8");
        System.out.println(findLengthsOfStrings(fiveStrings));

		
		// 9. Create a set of strings and add 5 values
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");
        System.out.println("\nQuestion 9");
        System.out.println(stringSet);
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
        System.out.println("\nQuestion 10");
        System.out.println(getSetThatBeginsWithChar(stringSet, 't'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
        System.out.println("\nQuestion 11");
        System.out.println(convertSetToList(stringSet));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
        Set<Integer> integerSet = new HashSet<>();
        for(int i = 1; i < 15; i++) {
        	integerSet.add(i);
        }
        System.out.println("\nQuestion 12");
        System.out.println(getOnlyEvenIntegers(integerSet));

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
        Map<String, String> dictionary =  new HashMap<>();
        dictionary.put("apple", "the round fruit of a tree of the rose family, which typically has thin red or green skin and crisp flesh.");
        dictionary.put("banana", "a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.");
        dictionary.put("cherry", "a small, round stone fruit that is typically bright or dark red.");
        System.out.println("\nQuestion 13");
        System.out.println(dictionary);
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
        System.out.println("\nQuestion 14");
        System.out.println("Search Term: banana");
        System.out.println(dictionaryLookup(dictionary, "banana"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
        System.out.println("\nQuestion 15");
        System.out.println("Search Char: a");
        System.out.println(countStartingCharacters(fiveStrings, 'a'));

	}

	// Method 15:
	private static Map<Character, Integer> countStartingCharacters(List<String> list, char character) {
		Map<Character, Integer> result =  new HashMap<>();
		int count = 0;
		for(String item : list) {
			if(item.charAt(0) == character) {
				count++;
			}
		}
		result.put(character, count);
		return result;
	}
	
	// Method 14:
	private static String dictionaryLookup(Map<String, String> dictionary, String searchString) {
		String result = dictionary.get(searchString);
		return result;
	}
	
	// Method 12:
	private static Set<Integer> getOnlyEvenIntegers(Set<Integer> integerSet) {
		Set<Integer> result =  new HashSet<>();
		for(Integer integer : integerSet) {
			if(integer % 2 == 0) {
				result.add(integer);
			}
		}
		return result;
	}

	// Method 11:
    private static List<String> convertSetToList(Set<String> stringSet) {
		List<String> result =  new ArrayList<>();
		for(String str : stringSet) {
			result.add(str);
		}
		return result;
	}

	// Method 10:
    private static Set<String> getSetThatBeginsWithChar(Set<String> stringSet, char searchChar) {
		Set<String> result =  new HashSet<>();
		for(String str : stringSet) {
			if(str.charAt(0) == searchChar) {
				result.add(str);
			}
		}
		return result;
	}
	
	// Method 8:
    private static List<Integer> findLengthsOfStrings(List<String> strings) {
		List<Integer> result =  new ArrayList<>();
		for(String str : strings) {
			result.add(str.length());
		}
		return result;
	}

	// Method 7:
    private static List<List<Integer>> sortIntegersByFactor(List<Integer> intList) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> divisibleBy2 = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> isNotDivisibleBy2or3or5 = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 == 0) {
                divisibleBy2.add(intList.get(i));
            } else if (intList.get(i) % 3 == 0) {
                divisibleBy3.add(intList.get(i));
            } else if (intList.get(i) % 5 == 0) {
                divisibleBy5.add(intList.get(i));
            } else {
            	isNotDivisibleBy2or3or5.add(intList.get(i));
            }
        }
        result.add(divisibleBy2);
        result.add(divisibleBy3);
        result.add(divisibleBy5);
        result.add(isNotDivisibleBy2or3or5);
        return result;
    }
	
	// Method 6:
    private static List<String> filterStringList(List<String> strings, String searchTerm) {
		List<String> result =  new ArrayList<>();
			for(String str : strings) {
				if(str.contains(searchTerm)) {
					result.add(str);
				}
			};
		return result;
	}

	// Method 5:
    private static String concatenateListOfStrings(List<String> strings) {
		StringBuilder result =  new StringBuilder();
		for(int i = 0; i < strings.size(); i++) {
			if (i < strings.size()-1 ) {
				result.append(strings.get(i)+",");
			}else {
				result.append(strings.get(i));
			}
		}
		return result.toString();
	}
		
	// Method 4:
    private static List<String> swapFirstAndLastElement(List<String> strings) {
		String temp = strings.get(0);
		strings.set(0, strings.get(strings.size() - 1));
        strings.set(strings.size() - 1, temp);
        return strings;
	}
	
	// Method 3:
 	public static String findShortest(List<String> strings) {
     	String shortest = strings.get(0);
     	for (int i = 1; i < strings.size(); i++) {
             if (strings.get(i).length() < shortest.length()) {
                 shortest = strings.get(i);
             }
         }
         return shortest;
     }
}