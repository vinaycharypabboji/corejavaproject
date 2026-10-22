package com.logicstatements;

import java.util.Scanner;

public class Testdemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = sc.nextLine();

		System.out.println("What is your Qualification? ");
		String qualification = sc.nextLine();

		if (qualification.equalsIgnoreCase("B.Tech") || qualification.equals("M.Tech") || qualification.equals("MBA")) {
			System.out.println("Good!");
			System.out.println("What is your percentage?");

			double percentage = sc.nextDouble();
			if (percentage >= 70.0) {
				System.out.println("Good Job Scoring the best!");
				System.out.println("Do you have 2 years professional work experience? ");

				String exp = sc.next();
				if (exp.equalsIgnoreCase("yes")) {
					System.out.println("OK !. Now we will dive into your skills");
					System.out.println("Do you have hands-on Knowledge on Java?");

					String java = sc.next();
					if (java.equalsIgnoreCase("yes")) {
						System.out.println("Good to know!");
						System.out.println("Do you have hands-on knowledge on python?");

						String py = sc.next();
						if (py.equalsIgnoreCase("yes")) {
							System.out.println("Good");
							System.out.println("Do you have any Framework knowledge?");

							String frm = sc.next();
							if (frm.equalsIgnoreCase("yes")) {
								System.out.println("ok!. What frame works are you familiar with?");

								String frmwork = sc.next();
								if (frmwork.equalsIgnoreCase("spring") || frmwork.equalsIgnoreCase("spring-boot")
										|| frmwork.equalsIgnoreCase("mongo-db")) {
									System.out.println("Good to know yoou are familiar with" + (frmwork) + "framework");
									System.out.println("what woul be your work preference?");

									String wrkprf = sc.next();
									if (wrkprf.equalsIgnoreCase("onsite") || wrkprf.equalsIgnoreCase("hybrid")
											|| wrkprf.equalsIgnoreCase("remote")) {
										System.out.println("ok!");
										System.out.println("What is your salary Expectation?");

										double salary = sc.nextDouble();
										if (salary >= 30000 && salary <= 45000) {
											System.out.println("Ok!. You may start from next week");

										} else {
											System.out.println("Sorry!.  What we could pay you is atmost 35,000");
											System.out.println("What do you say?");

											String salques = sc.next();
											if (salques.equalsIgnoreCase("yes")) {
												System.out.println("Ok!. You may start from next week");
											} else {
												System.out.println("Ok! . We will let you know by tomorrow");
											}
										}
									}

								} else {
									System.out.println("Come back when you learn frameworks!");
								}
							}
						} else {
							System.out.println("better learn it!");
						}

					} else {
						System.out.println("Straight , left and Exit!");
					}

				} else {
					System.out.println("you can leave for the day.");
				}
			}
		} else {
			System.out.println("you can leave for the day.");
		}

	}

}
