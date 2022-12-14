package KosulluIfadeler;

import java.util.Scanner;

public class BurcIfElse {
    public static void main(String[] args) {
        int month, day;
        String burc = null;
        boolean isExcept = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı girin : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü girin : ");
        day = input.nextInt();


        if (month == 1) {
            if (day <= 31 && day >= 1) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 2) {
            if (day <= 28 && day > 1) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 3) {
            if (day <= 31 && day > 1) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 4) {
            if (day <= 30 && day > 1) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 5) {
            if (day <= 31 && day > 1) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 6) {
            if (day <= 30 && day > 1) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 7) {
            if (day <= 31 && day > 1) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 8) {
            if (day <= 31 && day > 1) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 9) {
            if (day <= 30 && day > 1) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 10) {
            if (day <= 31 && day > 1) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akper";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 11) {
            if (day <= 30 && day > 1) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isExcept = true;
            }
        } else if (month == 12) {
            if (day <= 31 && day > 1) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isExcept = true;
            }
        } else {
            isExcept = true;
        }

        if (isExcept) {
            System.out.print("Hatalı giriş yaptınız .");
        } else {
            System.out.print("Merhaba, burcunuz : " + burc);
        }
    }

}