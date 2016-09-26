package Util;

import auxiliar.*;
import Util.Study;
import java.util.Arrays;
import java.util.List;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class SimilarityText {

    public static String value = "À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö "
            + "Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ø "
            + "ù ú û ü ý þ ÿ ";

    public static double[][] matSimilarity(List<Study> a, List<Study> b) {
        List<Study> list1 = new ArrayList<Study>();
        list1 = a;
        List<Study> list2 = new ArrayList<Study>();
        list2 = b;
        int a1 = list1.size(), b2 = list2.size();
        if (a1 < b2) {
            a1 = list2.size();
            b2 = list1.size();
        }
        double[][] matriz = new double[a1][b2];
        for (int i = 0; i < list1.size(); i++) {
//            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
            for (int j = 0; j < list2.size(); j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    //                System.out.println(" ->>> "+ similarity(list1.get(i).getContent(), list2.get(j).getContent()));
//                matriz[i][j] = similarity(list1.get(i).getContent(), list2.get(j).getContent());
//                System.out.println("i "+ i +"j "+j);
                    double aux = similarity(list1.get(i), list2.get(j));
                    matriz[i][j] = aux;
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_");
            for (int j = 0; j < list2.size(); j++) {
                //                System.out.println(" ->>> "+ similarity(list1.get(i).getContent(), list2.get(j).getContent()));
//                matriz[i][j] = similarity(list1.get(i).getContent(), list2.get(j).getContent());
                System.out.println(String.format("| %1$02d I - J %2$02d = %3$.3f|", i, j, matriz[i][j]));

            }
        }
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_");
        return matriz;
    }

    public static double similarity(Study s1, Study s2) {
//        String longer = validateTxt(s1.getContent()), shorter = validateTxt(s2.getContent());
        String longer = s1.getContent(), shorter = s2.getContent();
        if (s1.getContent().length() < s2.getContent().length()) {
            longer = s2.getContent();
            shorter = s1.getContent();
        }
        int longerLength = longer.length();
        if (longerLength == 0) {
            return 1.0;
        }
        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    costs[j] = j;
                } else if (j > 0) {
                    int newValue = costs[j - 1];
                    if (s1.charAt(i - 1) != s2.charAt(j - 1)) {
                        newValue = Math.min(Math.min(newValue, lastValue),
                                costs[j]) + 1;
                    }
                    costs[j - 1] = lastValue;
                    lastValue = newValue;
                }
            }
            if (i > 0) {
                costs[s2.length()] = lastValue;
            }
        }
        return costs[s2.length()];
    }

    public static String validateTxt(String str) {
        String value;
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        value = pattern.matcher(nfdNormalizedString).replaceAll("");
        value = value.replace("!", "").replace("@", "").replace("?", "")
                .replace("$", "").replace("%", "").replace("*", "")
                .replace("(", "").replace(")", "").replace("&", "")
                .replace("-", "").replace("+", "").replace("_", "")
                .replace(".", "").replace(",", "").replace(";", "")
                .replace("'\'", "").replace("/", "").replace(":", "");
        return value;
    }

    public static void printSimilarity(Study s, Study t) {
        System.out.println(String.format(
                "%.3f is the similarity between \"%s\" and \"%s\"", similarity(s, t), s, t));
    }

//    public static void main(String[] args) {
//        List lista1 = Arrays.asList("ola eu estou aqui", "oi", "aaa", "bbb", "ccc", "eee");
//        List lista2 = Arrays.asList("eu quero bolo", "house", "aba", "aab", "ddd", "eee");
//        String aux = "Ol@, a casa é azul! ? ";
//
//        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
////        System.out.println("ValidadeTXT| " + validateTxt(aux));
//
//        for (int i = 0; i < lista1.size(); i++) {
//            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//            for (int j = 0; j < lista2.size(); j++) {
//                double[][] valor = null;
//                //valor[i][j]= similarity(lista1.get(i).toString(), lista2.get(j).toString());
//                printSimilarity(lista1.get(i).toString(), lista2.get(j).toString());
//
//            }
//        }
//        String txt1, txt2, txt3, txt4, txt5;
//
//        txt1 = "The objective of this paper is to determine under what circumstances individual organisations would be able to rely on cross-company based estimation models. We performed a systematic review of studies that compared predictions from crosscompany models with predictions from within-company models based on analysis of project data. Ten papers compared cross-company and within-company estimation models, however, only seven of the papers presented independent results. Of those seven, three found that crosscompany models were as good as within-company models, four found cross-company models were significantly worse than within-company models. Experimental procedures used by the studies d iffered making it impossible to undertake formal meta-analysis of the results. The main trend distinguishing study results was that studies with small single company data sets (i.e. 20 projects) that used leaveone-out cross-validation all found that the within-company model was significantly more accurate than the cross-company model. The results of this review are inconclusive. It is clear that some organisations would be ill-served by cross-company models whereas others would benefit. Further studies are needed, but they must be independent (i.e. based on different data bases or at least different single comp any data sets). In addition, experimenters need to standardise their experimental procedures to enable formal meta-analysis.";
//        txt2 = "The objective is to determine the consistency within and between results in empirical studies of software engineering cost estimation. We focus on regression and analogy techniques as these are commonly used. We conducted an exhaustive literature search using predefined inclusion and exclusion criteria and identified 67 journal papers and 104 conference papers. From this sample we identified 11 journal papers and 9 conference papers that used both methods. Our analysis found that about 25% of studies were internally inconclusive. We also found that there is approximately equal evidence in favour of, and against analogy-based methods. We confirm the lack of consistency in the findings and argue that this inconsistent pattern from 20 different studies comparing regression and analogy is somewhat disturbing. It suggests that we need to ask more detailed questions than just: What is the best prediction system?";
//        txt3 = "Laboratory-based courses play a critical role in scientific education. Automation is changing the nature of these laboratories, and there is a long-running debate about the value of hands-on versus simulated laboratories. In addition, the introduction of remote laboratories adds a third category to the debate. Through a review of the literature related to these labs in education, the authors draw several conclusions about the state of current research. The debate over different technologies is confounded by the use of different educational objectives as criteria for judging the laboratories: Hands-on advocates emphasize design skills, while remote lab advocates focus on conceptual understanding. We observe that the boundaries among the three labs are blurred in the sense that most laboratories are mediated by computers, and that the psychology of presence may be as important as technology. We also discuss areas for future research.";
//        txt4 = " As software systems evolve over time, they invariably undergo changes that can lead to a degeneration of the architecture. Left unchecked, degeneration may reach a level where a complete redesign is necessary, a task that requires significant effort. In this paper, we present a survey of technologies developed by researchers that can be used to combat degeneration, that is, technologies that can be employed in identifying, treating and researching degeneration. We also discuss the various causes of degeneration and how it can be prevented.";
//        txt5 = " This paper provides an extensive review of studies related to expert estimation of software development effort. The main goal and contribution of the review is to support the research on expert estimation, e.g., to ease other researcher's search for relevant expert estimation studies. In addition, we provide software practitioners with useful estimation guidelines, based on the research-based knowledge of expert estimation processes. The review results suggest that expert estimation is the most frequently applied estimation strategy for software projects, that there is no substantial evidence in favour of use of estimation models, and that there are situations where we can expect expert estimates to be more accurate than formal estimation models. The following 12 expert estimation \"best practice\" guidelines are evaluated through the review: (1) evaluate estimation accuracy, but avoid high evaluation pressure; (2) avoid conflicting estimation goals; (3) ask the estimators to justify and criticize their estimates; (4) avoid irrelevant and unreliable estimation information; (5) use documented data from previous development tasks; (6) find estimation experts with relevant domain background and good estimation records; (7) Estimate top-down and bottom-up, independently of each other; (8) use estimation checklists; (9) combine estimates from different experts and estimation strategies; (10) assess the uncertainty of the estimate; (11) provide feedback on estimation accuracy and development task relations; and, (12) provide estimation training opportunities. We found supporting evidence for all 12 estimation principles, and provide suggestions on how to implement them in software organizations.";
//
//        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//        System.out.println("TESTE TXT");
//        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//        System.out.println("incluido1 + incluido2");
//        System.out.println("--> " + similarity(txt1, txt2));
//        System.out.println("incluido1 + excluido3");
//        System.out.println("--> " + similarity(txt1, txt3));
//        System.out.println("incluido2 + excluido3");
//        System.out.println("--> " + similarity(txt2, txt3));
//        System.out.println("incluido1 + excluido4");
//        System.out.println("--> " + similarity(txt1, txt4));
//        System.out.println("incluido2 + excluido4");
//        System.out.println("--> " + similarity(txt2, txt4));
//        System.out.println("incluido1 + incluido5");
//        System.out.println("--> " + similarity(txt1, txt5));
//        System.out.println("incluido2 + incluido5");
//        System.out.println("--> " + similarity(txt2, txt5));
//        System.out.println("incluido5 + excluido4");
//        System.out.println("--> " + similarity(txt5, txt4));
//        System.out.println("incluido5 + excluido3");
//        System.out.println("--> " + similarity(txt5, txt3));
//
////        printSimilarity(lista1.get(0).toString(), lista2.get(0).toString());
////        printSimilarity(lista1.get(1).toString(), lista2.get(1).toString());
////        printSimilarity(lista1.get(2).toString(), lista2.get(2).toString());
////        printSimilarity(lista1.get(4).toString(), lista2.get(4).toString());
////        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
////        printSimilarity(lista1.get(0).toString(), lista2.get(0).toString());
////        printSimilarity(lista1.get(1).toString(), lista2.get(1).toString());
////        printSimilarity(lista1.get(1).toString(), lista2.get(2).toString());
////        printSimilarity(lista1.get(1).toString(), lista2.get(3).toString());
////        printSimilarity(lista1.get(1).toString(), lista2.get(4).toString());
//    }

}
