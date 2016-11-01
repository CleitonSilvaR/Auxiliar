/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Util.Study;
import java.util.ArrayList;
import java.util.List;
import orderRanking.Ranking;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Cleiton
 */
public class teste {
    
    public static List<Study> loading(){
        ArrayList<Study> list1 = new ArrayList<Study>();
        Study estudo2 = new Study();
        estudo2.setAuthor("B. G. Ryder M. L. Soffa, M. B.");
        estudo2.setTitle("The impact of software engineering research on modern progamming languages");
        estudo2.setContent("Purpose - This paper aims to use a knowledge management (KM) approach to effectively revise a utility retailer's software testing process. This paper presents a case study of how the utility organisation's customer services IT production support group improved their test planning skills through applying the American Productivity and Quality Center (APQC) KM framework to deï¬�ne a software-testing process. This included the ongoing maintenance and use of a business knowledge repository comprising software test cases. Design/methodology/approach - An action learning approach was used for workplace training facilitated by one of the authors. Applying and reï¬�ning learnings gained in a series of three workshops achieved these outcomes. The ï¬�rst two workshops focused on improving test-planning skills and the third on introducing KM concepts, the APQC KM framework and the development of a KM based software-testing process that combined explicit and tacit knowledge. Findings - The combination of workshop outputs, workshop evaluation feedback and lessons learned during the following two months suggests that the KM approach was an effective way for teams or organisations wanting to capture and convey tacit knowledge on software testing. Research limitations/implications - Participants viewed the described approach as an easily comprehensible and relatively quick method to deï¬�ne a KM based process and deï¬�ne the factors that can inï¬‚uence the success of a KM based process. While our results suggest that this KM approach could be more generally applied to transfer of high-intensity tacit knowledge workplace training situations, the case study was conï¬�ned to a single group and focused on software testing only. Originality/value - Provide information on a utility retailer's software testing process.");
        estudo2.setValues(false);
        list1.add(estudo2);

        Study estudo3 = new Study();
        estudo3.setAuthor("B. Kitchenham E. Mendes, G. H. T");
        estudo3.setTitle("Cross versus Within-Company Cost Estimation Studies: A Systematic Review");
        estudo3.setContent("Purpose â€“ This paper aims to use a knowledge management (KM) approach to effectively revise a utility retailerâ€™s software testing process. This paper presents a case study of how the utility organisationâ€™s customer services IT production support group improved their test planning skills through applying the American Productivity and Quality Center (APQC) KM framework to deï¬�ne a software-testing process. This included the ongoing maintenance and use of a business knowledge repository comprising software test cases. Design/methodology/approach â€“ An action learning approach was used for workplace training facilitated by one of the authors. Applying and reï¬�ning learnings gained in a series of three workshops achieved these outcomes. The ï¬�rst two workshops focused on improving test-planning skills and the third on introducing KM concepts, the APQC KM framework and the development of a KM based software-testing process that combined explicit and tacit knowledge. Findings â€“ The combination of workshop outputs, workshop evaluation feedback and lessons learned during the following two months suggests that the KM approach was an effective way for teams or organisations wanting to capture and convey tacit knowledge on software testing. Research limitations/implications â€“ Participants viewed the described approach as an easily comprehensible and relatively quick method to deï¬�ne a KM based process and deï¬�ne the factors that can inï¬‚uence the success of a KM based process. While our results suggest that this KM approach could be more generally applied to transfer of high-intensity tacit knowledge workplace training situations, the case study was conï¬�ned to a single group and focused on software testing only. Originality/value â€“ Provide information on a utility retailerâ€™s software testing process.");
        estudo3.setValues(true);
        list1.add(estudo3);

        Study estudo4 = new Study();
        estudo4.setAuthor("B. Kitchenham E. Mendes, G. H. T.");
        estudo4.setTitle("A Systematic Review of Cross- vs. Within-Company Cost Estimation Studies");
        estudo4.setContent("The objective of this empirical study was to explore outsourcing in software testing and shape hypotheses that explain the association between outsourcing and knowledge management. First, a survey of testing practices was conducted and 26 organizational units (OUs) were interviewed. From this sample, five OUs were further selected for an in-depth case study. The study used qualitative grounded theory as its research method and the data was collected from 41 theme-based interviews. The analysis yielded hypotheses that included that the business orientation of an OU affects outsourcing of testing and the knowledge management strategy, outsourcing seems to be more effective when independent testing agencies have enough domain knowledge, and outsourcing verification tasks is more difficult than outsourcing validation tasks. The results of this study can be used in developing the knowledge management strategy and as guidance in making outsourcing decisions.");
        estudo4.setValues(true);
        list1.add(estudo4);

        Study estudo5 = new Study();
        estudo5.setAuthor("C. Mair, M. S.");
        estudo5.setTitle("The consistency of empirical comparisons of regression and analogy-based software project cost prediction");
        estudo5.setContent("Test staff in modern software consultancy companies often has to work in multiple projects that differ not only technically, but also from organizational, management and social aspects. The ease and speed with which staff can adapt to new projects and environments is crucial for the success and profitability of the consultancy company. This paper investigates how management in a Swedish software company can facilitate test staff relocation practices. Consultants in the testing department were interviewed to elicit the differences between testing projects they are involved in and their views on the challenges of and learning needed when relocating between projects. Based on this we present an approach to better support such staff relocations. The approach is based on a knowledge sharing process and the introduction of specific templates to capture testing experience. Initial, static validation in the associated company shows that the approach has merit and should be further evaluated.");
        estudo5.setValues(true);
        list1.add(estudo5);

        Study estudo6 = new Study();
        estudo6.setAuthor("C. Zannier G. Melnik, F. M.");
        estudo6.setTitle("On the success of empirical studies in the international conference on software engineering");
        estudo6.setContent("Software testing is a key aspect of software reliability and quality assurance in a context where software development constantly has to overcome mammoth challenges in a continuously changing environment. One of the characteristics of software testing is that it has a large intellectual capital component and can thus beneï¬�t from the use of the experience gained from past projects. Software testing can, then, potentially beneï¬�t from solutions provided by the knowledge management discipline. There are in fact a number of proposals concerning effective knowledge management related to several software engineering processes. Objective: We defend the use of a lesson learned system for software testing. The reason is that such a system is an effective knowledge management resource enabling testers and managers to take advantage of the experience locked away in the brains of the testers. To do this, the experience has to be gathered, disseminated and reused. Method: After analyzing the proposals for managing software testing experience, signiï¬�cant weaknesses have been detected in the current systems of this type. The architectural model proposed here for lesson learned systems is designed to try to avoid these weaknesses. This model (i) deï¬�nes the structure of the software testing lessons learned; (ii) sets up procedures for lesson learned management; and (iii) supports the design of software tools to manage the lessons learned. Results: A different approach, based on the management of the lessons learned that software testing engineers gather from everyday experience, with two basic goals: usefulness and applicability. Conclusion: The architectural model proposed here lays the groundwork to overcome the obstacles to sharing and reusing experience gained in the software testing and test management. As such, it provides guidance for developing software testing lesson learned systems.");
        estudo6.setValues(true);
        list1.add(estudo6);

        Study estudo29 = new Study();
        estudo29.setAuthor("R. L. Glass V. Ramesh, I. V.");
        estudo29.setTitle("An analysis of research in computing disciplines");
        estudo29.setContent("Functional veriï¬�cation is one of the major bottlenecks in system-on-chip design due to the combined effects of increasing complexity and lack of automated techniques for generating efï¬�cient tests. Several promising ideas using bounded model checking are proposed over the years to efï¬�ciently generate counterexamples (tests). The existing researchers have used incremental satisï¬�ability to improve the counterexample generation, involving only one property by sharing knowledge across instances of the same property with incremental bounds. In this paper, we present a framework that can efï¬�ciently reduce the overall test generation time by exploiting the similarity among different properties. This paper makes two primary contributions: 1) it proposes novel methods to cluster similar properties; and 2) it develops efï¬�cient learning techniques that can signiï¬�cantly reduce the overall test generation time for the properties in a cluster by sharing knowledge across similar test generation instances. Our experimental results using both software and hardware benchmarks demonstrate that our approach can drastically reduce (on average three to ï¬�ve times) the overall test generation time compared to existing methods.");
        estudo29.setValues(true);
        list1.add(estudo29);
        
        Study estudo30 = new Study();
        estudo30.setAuthor("R. L. Glass V. Ramesh, I. V.");
        estudo30.setTitle("An analysis of research in computing disciplines");
        estudo30.setContent("Testing Automation has been growing in software engineering. Many organizations are investing in automated testing in order to prevent defects and increase testing effectiveness during software development. In agile methodologies, this task is considered an important activity, considered the key of the agile testing. This paper presents three testing automation strategies applied to three different software projects adopting Scrum agile methodology. The results indicated positive agile practices to be considered when adopting testing automation strategy, such as: team collaboration, task distribution, testing tools, knowledge managements. The challenges, results, and lessons learned from this experience are also discussed.");
        estudo30.setValues(true);
        list1.add(estudo30);
        
        Study estudo31 = new Study();
        estudo31.setAuthor("R. L. Glass V. Ramesh, I. V.");
        estudo31.setTitle("An analysis of research in computing disciplines");
        estudo31.setContent("Netpal is a web-based dynamic knowledge base system designed to assist network administrators in their troubleshooting tasks, in recalling and storing experience, and in identifying new failure cases and their symptoms. In the context of web hosting environments, Netpal summarises network data and and supports retrieval of relevant organisational experience for system administrators. The system design draws on a variety of domains including knowledge management, information retrieval, machine learning and network management. We describe the system architecture, user interface design, user software testing and future directions for development.");
        estudo31.setValues(true);
        list1.add(estudo31);
    
        return list1;
                
    }
    
    public teste() {
        ArrayList<Study> list1 = new ArrayList<Study>();
        System.out.println("ola");
        list1 = (ArrayList<Study>) loading();
        
        
        
        List ranking = new ArrayList<Ranking>();
        for (int i=0; i<list1.size();i++){
            Ranking aux = new Ranking(list1.get(i), i);
            ranking.add(aux);
        }
        System.out.println(ranking);
        Collections.sort (ranking);
        System.out.println (ranking);
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
