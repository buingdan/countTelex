package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Đọc chuỗi đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Danh sách các mẫu Telex ă=aw, â=aa, đ=dd, ê=ee, ô=oo, ơ=ow, ư=w
        String[] telexPatterns = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        int count = 0;

        // Duyệt qua từng mẫu Telex và đếm số lần xuất hiện trong input
        for (String pattern : telexPatterns) {
            while (input.contains(pattern)) {
                input = input.replaceFirst(pattern, "#"); // Thay thế mẫu đã tìm thấy lần đầu tiên ở input để tránh đếm trùng lặp
                count++;
            }
        }

        System.out.println("Output: " + count);
    }
}