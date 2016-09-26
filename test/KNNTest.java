
//import static junit.Assert.*;
import Util.CalculatorSimilarityImplements;
import static Util.InstantiatingBib.carrega;
import java.util.ArrayList;

import org.junit.Test;
import Util.SimilarityText;
import Util.Ponto;
import Util.PontoDistanceCalculator;
import static Util.SimilarityText.matSimilarity;
import Util.Study;
import java.util.List;
import knn.KNN;
import knn.KnnSim;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author andreendo
 *
 */
public class KNNTest {

    @Test
    public void test01() {

        ArrayList<Ponto> pontos = new ArrayList<>();
        pontos.add(new Ponto(0, 0));
        pontos.add(new Ponto(-1.5, 3));
        pontos.add(new Ponto(10, 10));
        pontos.add(new Ponto(110, 120));
        pontos.add(new Ponto(1.2, 1.1));
        pontos.add(new Ponto(10, 10));
        pontos.add(new Ponto(11, 11));
        pontos.add(new Ponto(1, 20));
        pontos.add(new Ponto(110, 120));

        Ponto referencia = new Ponto(1.1, 1.1);
        //referencia sempre vai re 1, o valor mais proximo é os knns

        KNN<Ponto> knn = new KNN<Ponto>();
        //tipo study
        knn.setList(pontos);
        //list carrega
        knn.setDistanceCalculator(new PontoDistanceCalculator());
        //parametro double da semelhanca
        knn.setReference(referencia);

//        KNN<Ponto> knn = new KNN<Ponto>();
//        knn.setList(pontos);
//        //matriz
////        knn.setDistanceCalculator(x[i][j]);
//        knn.setReference(referencia);
        ArrayList<Ponto> neighbors = knn.getKNearestNeighbors(5);
        //alterar para 5 vizinhos

        assertEquals(5, neighbors.size());
        System.out.println("Neighbord: " + neighbors);
        assertTrue(neighbors.get(0).equals(new Ponto(1.2, 1.1)));
        assertTrue(neighbors.get(1).equals(new Ponto(0, 0)));
        assertTrue(neighbors.get(2).equals(new Ponto(-1.5, 3)));
        System.out.println(neighbors.get(3).toString());
    }

    @Test
    public void test02() {
        //create a different class and distance calculator and test here!

        Study referencia = new Study();
        //referencia sempre vai re 1, o valor mais proximo é os knns

        KnnSim<Study> knn = new KnnSim<Study>();
        //tipo study
        List<Study> list1 = new ArrayList<Study>();
        list1 = carrega();
        List<Study> list2 = new ArrayList<Study>();
        list2 = carrega();
//        matSimilarity(list1, list2);

        knn.setList((ArrayList<Study>) list1);
        //list carrega
        //knn.setDistanceCalculator(new CalculatorSimilarityImplements());
        //parametro double da semelhanca
        knn.setReference(list1.get(0));

        ArrayList<Study> neighbors = knn.getKNearestNeighbors(5);
        //alterar para 5 vizinhos

        assertEquals(5, neighbors.size());
        System.out.println();
        System.out.println("autor " + list1.get(0).getAuthor());
        System.out.println("Neighbord: " + neighbors.get(0).getContent());
        System.out.println("Neighbord: " + neighbors.get(0).getAuthor());
        System.out.println("Neighbord: " + neighbors.get(1).getContent());
        System.out.println("Neighbord: " + neighbors.get(2).getContent());
        System.out.println("Neighbord: " + neighbors.get(3).getContent());
        System.out.println("Neighbord: " + neighbors.get(4).getContent());
        System.out.println("||||||||||");
        System.out.println("Neighbord: " + neighbors.get(0).getValues());
        System.out.println("Neighbord: " + neighbors.get(1).getValues());
        System.out.println("Neighbord: " + neighbors.get(2).getValues());
        System.out.println("Neighbord: " + neighbors.get(3).getValues());
        System.out.println("Neighbord: " + neighbors.get(4).getValues());

//        KNN<Ponto> knn = new KNN<Ponto>();
//        knn.setList(pontos);
//        //matriz
////        knn.setDistanceCalculator(x[i][j]);
//        knn.setReference(referencia);
//        assertTrue(neighbors.get(0).equals(new Ponto(1.2, 1.1)));
//        assertTrue(neighbors.get(1).equals(new Ponto(0, 0)));
//        assertTrue(neighbors.get(2).equals(new Ponto(-1.5, 3)));
//        System.out.println(neighbors.get(3).toString());
//        System.out.println(neighbors.get(4).toString());
    }

    @Test
    public void test03() {
        //tipo study
        ArrayList<Study> list1 = new ArrayList<Study>();
//        pontos.add(new Ponto(0, 0));
        Study ref = new Study();
        ref.setAuthor("Aberdour, M");
        ref.setTitle("Achieving Quality in Open Source Software");
        ref.setContent("The open source software community has published a substantial body of research on OSS quality. Focusing on this peer-reviewed body of work lets us draw conclusions from empirical data rather than rely on the large volume of evangelical opinion that has historically dominated this field. This body of published research has become much more critical and objective in its efforts to understand OSS development, and a consensus has emerged on the key components of high-quality OSS delivery. This article reviews this body of research and draws out lessons learned, investigating how the approaches used to deliver high-quality OSS differ from, and can be incorporated into, closed-source software development.");
        ref.setValues(false);

        Study estudo2 = new Study();
        estudo2.setAuthor("B. G. Ryder M. L. Soffa, M. B.");
        estudo2.setTitle("The impact of software engineering research on modern progamming languages");
        estudo2.setContent("Software engineering research and programming language design have enjoyed a symbiotic relationship, with traceable impacts since the 1970s, when these areas were first distinguished from one another. This report documents this relationship by focusing on several major features of current programming languages: data and procedural abstraction, types, concurrency, exceptions, and visual programming mechanisms. The influences are determined by tracing references in publications in both fields, obtaining oral histories from language designers delineating influences on them, and tracking cotemporal research trends and ideas as demonstrated by workshop topics, special issue publications, and invited talks in the two fields. In some cases there is conclusive data supporting influence. In other cases, there are circumstantial arguments (i.e., cotemporal ideas) that indicate influence. Using this approach, this study provides evidence of the impact of software engineering research on modern programming language design and documents the close relationship between these two fields.");
        estudo2.setValues(false);
        list1.add(estudo2);

        Study estudo3 = new Study();
        estudo3.setAuthor("B. Kitchenham E. Mendes, G. H. T");
        estudo3.setTitle("Cross versus Within-Company Cost Estimation Studies: A Systematic Review");
        estudo3.setContent("The objective of this paper is to determine under what circumstances individual organizations would be able to rely on cross-company-based estimation models. We performed a systematic review of studies that compared predictions from cross-company models with predictions from within-company models based on analysis of project data. Ten papers compared cross-company and within-company estimation models; however, only seven presented independent results. Of those seven, three found that cross-company models were not significantly different from within-company models, and four found that cross-company models were significantly worse than within-company models. Experimental procedures used by the studies differed making it impossible to undertake formal meta-analysis of the results. The main trend distinguishing study results was that studies with small within-company data sets (i.e., $20 projects) that used leave-one-out cross validation all found that the within-company model was significantly different (better) from the cross-company model. The results of this review are inconclusive. It is clear that some organizations would be ill-served by cross-company models whereas others would benefit. Further studies are needed, but they must be independent (i.e., based on different data bases or at least different single company data sets) and should address specific hypotheses concerning the conditions that would favor cross-company or within-company models. In addition, experimenters need to standardize their experimental procedures to enable formal meta-analysis, and recommendations are made in Section 3.");
        estudo3.setValues(true);
        list1.add(estudo3);

        Study estudo4 = new Study();
        estudo4.setAuthor("B. Kitchenham E. Mendes, G. H. T.");
        estudo4.setTitle("A Systematic Review of Cross- vs. Within-Company Cost Estimation Studies");
        estudo4.setContent(" The objective of this paper is to determine under what circumstances individual organisations would be able to rely on cross-company based estimation models. We performed a systematic review of studies that compared predictions from crosscompany models with predictions from within-company models based on analysis of project data. Ten papers compared cross-company and within-company estimation models, however, only seven of the papers presented independent results. Of those seven, three found that crosscompany models were as good as within-company models, four found cross-company models were significantly worse than within-company models. Experimental procedures used by the studies d iffered making it impossible to undertake formal meta-analysis of the results. The main trend distinguishing study results was that studies with small single company data sets (i.e. 20 projects) that used leaveone-out cross-validation all found that the within-company model was significantly more accurate than the cross-company model. The results of this review are inconclusive. It is clear that some organisations would be ill-served by cross-company models whereas others would benefit. Further studies are needed, but they must be independent (i.e. based on different data bases or at least different single comp any data sets). In addition, experimenters need to standardise their experimental procedures to enable formal meta-analysis.");
        estudo4.setValues(true);
        list1.add(estudo4);

        Study estudo5 = new Study();
        estudo5.setAuthor("C. Mair, M. S.");
        estudo5.setTitle("The consistency of empirical comparisons of regression and analogy-based software project cost prediction");
        estudo5.setContent(" The objective is to determine the consistency within and between results in empirical studies of software engineering cost estimation. We focus on regression and analogy techniques as these are commonly used. We conducted an exhaustive literature search using predefined inclusion and exclusion criteria and identified 67 journal papers and 104 conference papers. From this sample we identified 11 journal papers and 9 conference papers that used both methods. Our analysis found that about 25% of studies were internally inconclusive. We also found that there is approximately equal evidence in favour of, and against analogy-based methods. We confirm the lack of consistency in the findings and argue that this inconsistent pattern from 20 different studies comparing regression and analogy is somewhat disturbing. It suggests that we need to ask more detailed questions than just: What is the best prediction system?");
        estudo5.setValues(true);
        list1.add(estudo5);

        Study estudo6 = new Study();
        estudo6.setAuthor("C. Zannier G. Melnik, F. M.");
        estudo6.setTitle("On the success of empirical studies in the international conference on software engineering");
        estudo6.setContent("Due to the importance of software architectural documents, its review became a fundamental activity for the success of software projects and for the software quality improvement. Software architecture evaluation is a subject that has been intensively studied by diverse research groups. However there is a lack of formal reviews aiming at identifying the existence of software evaluation approaches. The bibliographical reviews that have been accomplished can not be audited or repeated, making them entirely dependent upon the researchers for the obtained results, which could introduce bias on the research results. To prevent these limitations, this paper describes a systematic review aiming at the dentification of existing architectural evaluation approaches. Based on the result of this review, we summarize the main characteristics, advantages and limitations of the identified evaluation approaches and propose the requirements for a checklist based software architectural documents evaluation approach.");
        estudo6.setValues(true);
        list1.add(estudo6);

        Study estudo29 = new Study();
        estudo29.setAuthor("R. L. Glass V. Ramesh, I. V.");
        estudo29.setTitle("An analysis of research in computing disciplines");
        estudo29.setContent("Comparing the topics and methods of the three major subdivisions of the computing realm.");
        estudo29.setValues(true);
        list1.add(estudo29);

//        matSimilarity(list1, list1);

//        list1 =  (ArrayList<Study>) carrega();
        //matSimilarity(list1, list1);
        ArrayList<Study> list2 = new ArrayList<Study>();
        list2 = (ArrayList<Study>) carrega();
        KNN<Study> knn = new KNN<Study>();
//        Study ref = list1.remove(0);

        knn.setList(list2);
        knn.setDistanceCalculator(new CalculatorSimilarityImplements());
        knn.setReference(ref);

        ArrayList<Study> neighbors = knn.getKNearestNeighbors(6);
        //alterar para 5 vizinhos

        assertEquals(6, neighbors.size());
        System.out.println();
        for (int i = 0; i < list1.size(); i++) {
            System.out.println( i +" : "+list1.get(i).toString());
        }
        System.out.println();
        for (Study neighbor : neighbors) {
            System.out.println(neighbor);
        }
        System.out.println(ref);
//        KNN<Ponto> knn = new KNN<Ponto>();
//        knn.setList(pontos);
//        //matriz
////        knn.setDistanceCalculator(x[i][j]);
//        knn.setReference(referencia);
//        assertTrue(neighbors.get(0).equals(new Ponto(1.2, 1.1)));
//        assertTrue(neighbors.get(1).equals(new Ponto(0, 0)));
//        assertTrue(neighbors.get(2).equals(new Ponto(-1.5, 3)));
//        System.out.println(neighbors.get(3).toString());
//        System.out.println(neighbors.get(4).toString());
    }
}
