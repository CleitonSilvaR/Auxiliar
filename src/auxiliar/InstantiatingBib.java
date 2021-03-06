/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import Util.Study;
import static auxiliar.SimilarityText.printSimilarity;
import static auxiliar.SimilarityText.similarity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Cleiton
 */
public class InstantiatingBib {

    

    public static List carrega() {
        List<Study> list = new ArrayList<Study>();
        //list = Arrays.asList(new Studies[37]);

//        estudo.setAuthor("");
//        estudo.setTitle("");
//        estudo.setContent("");
//        estudo.setValues(false);
//        list.add(estudo);
        Study estudo = new Study();
        estudo.setAuthor("Aberdour, M");
        estudo.setTitle("Achieving Quality in Open Source Software");
        estudo.setContent("The open source software community has published a substantial body of research on OSS quality. Focusing on this peer-reviewed body of work lets us draw conclusions from empirical data rather than rely on the large volume of evangelical opinion that has historically dominated this field. This body of published research has become much more critical and objective in its efforts to understand OSS development, and a consensus has emerged on the key components of high-quality OSS delivery. This article reviews this body of research and draws out lessons learned, investigating how the approaches used to deliver high-quality OSS differ from, and can be incorporated into, closed-source software development.");
        estudo.setValues(false);
        list.add(estudo);
//        list.set(0, estudo);

        Study estudo2 = new Study();
        estudo2.setAuthor("B. G. Ryder M. L. Soffa, M. B.");
        estudo2.setTitle("The impact of software engineering research on modern progamming languages");
        estudo2.setContent("Software engineering research and programming language design have enjoyed a symbiotic relationship, with traceable impacts since the 1970s, when these areas were first distinguished from one another. This report documents this relationship by focusing on several major features of current programming languages: data and procedural abstraction, types, concurrency, exceptions, and visual programming mechanisms. The influences are determined by tracing references in publications in both fields, obtaining oral histories from language designers delineating influences on them, and tracking cotemporal research trends and ideas as demonstrated by workshop topics, special issue publications, and invited talks in the two fields. In some cases there is conclusive data supporting influence. In other cases, there are circumstantial arguments (i.e., cotemporal ideas) that indicate influence. Using this approach, this study provides evidence of the impact of software engineering research on modern programming language design and documents the close relationship between these two fields.");
        estudo2.setValues(false);
        list.add(estudo2);
//        list.set(1, estudo2);

        Study estudo3 = new Study();
        estudo3.setAuthor("B. Kitchenham E. Mendes, G. H. T");
        estudo3.setTitle("Cross versus Within-Company Cost Estimation Studies: A Systematic Review");
        estudo3.setContent("The objective of this paper is to determine under what circumstances individual organizations would be able to rely on cross-company-based estimation models. We performed a systematic review of studies that compared predictions from cross-company models with predictions from within-company models based on analysis of project data. Ten papers compared cross-company and within-company estimation models; however, only seven presented independent results. Of those seven, three found that cross-company models were not significantly different from within-company models, and four found that cross-company models were significantly worse than within-company models. Experimental procedures used by the studies differed making it impossible to undertake formal meta-analysis of the results. The main trend distinguishing study results was that studies with small within-company data sets (i.e., $20 projects) that used leave-one-out cross validation all found that the within-company model was significantly different (better) from the cross-company model. The results of this review are inconclusive. It is clear that some organizations would be ill-served by cross-company models whereas others would benefit. Further studies are needed, but they must be independent (i.e., based on different data bases or at least different single company data sets) and should address specific hypotheses concerning the conditions that would favor cross-company or within-company models. In addition, experimenters need to standardize their experimental procedures to enable formal meta-analysis, and recommendations are made in Section 3.");
        estudo3.setValues(true);
        list.add(estudo3);
//        list.set(2, estudo3);

        Study estudo4 = new Study();
        estudo4.setAuthor("B. Kitchenham E. Mendes, G. H. T.");
        estudo4.setTitle("A Systematic Review of Cross- vs. Within-Company Cost Estimation Studies");
        estudo4.setContent(" The objective of this paper is to determine under what circumstances individual organisations would be able to rely on cross-company based estimation models. We performed a systematic review of studies that compared predictions from crosscompany models with predictions from within-company models based on analysis of project data. Ten papers compared cross-company and within-company estimation models, however, only seven of the papers presented independent results. Of those seven, three found that crosscompany models were as good as within-company models, four found cross-company models were significantly worse than within-company models. Experimental procedures used by the studies d iffered making it impossible to undertake formal meta-analysis of the results. The main trend distinguishing study results was that studies with small single company data sets (i.e. 20 projects) that used leaveone-out cross-validation all found that the within-company model was significantly more accurate than the cross-company model. The results of this review are inconclusive. It is clear that some organisations would be ill-served by cross-company models whereas others would benefit. Further studies are needed, but they must be independent (i.e. based on different data bases or at least different single comp any data sets). In addition, experimenters need to standardise their experimental procedures to enable formal meta-analysis.");
        estudo4.setValues(true);
        list.add(estudo4);
//        list.set(3, estudo4);

        Study estudo5 = new Study();
        estudo5.setAuthor("C. Mair, M. S.");
        estudo5.setTitle("The consistency of empirical comparisons of regression and analogy-based software project cost prediction");
        estudo5.setContent(" The objective is to determine the consistency within and between results in empirical studies of software engineering cost estimation. We focus on regression and analogy techniques as these are commonly used. We conducted an exhaustive literature search using predefined inclusion and exclusion criteria and identified 67 journal papers and 104 conference papers. From this sample we identified 11 journal papers and 9 conference papers that used both methods. Our analysis found that about 25% of studies were internally inconclusive. We also found that there is approximately equal evidence in favour of, and against analogy-based methods. We confirm the lack of consistency in the findings and argue that this inconsistent pattern from 20 different studies comparing regression and analogy is somewhat disturbing. It suggests that we need to ask more detailed questions than just: What is the best prediction system?");
        estudo5.setValues(true);
        list.add(estudo5);
//        list.set(4, estudo5);

        Study estudo6 = new Study();
        estudo6.setAuthor("C. Zannier G. Melnik, F. M.");
        estudo6.setTitle("On the success of empirical studies in the international conference on software engineering");
        estudo6.setContent("Due to the importance of software architectural documents, its review became a fundamental activity for the success of software projects and for the software quality improvement. Software architecture evaluation is a subject that has been intensively studied by diverse research groups. However there is a lack of formal reviews aiming at identifying the existence of software evaluation approaches. The bibliographical reviews that have been accomplished can not be audited or repeated, making them entirely dependent upon the researchers for the obtained results, which could introduce bias on the research results. To prevent these limitations, this paper describes a systematic review aiming at the dentification of existing architectural evaluation approaches. Based on the result of this review, we summarize the main characteristics, advantages and limitations of the identified evaluation approaches and propose the requirements for a checklist based software architectural documents evaluation approach.");
        estudo6.setValues(true);
        list.add(estudo6);
//        list.set(5, estudo);

        Study estudo7 = new Study();
        estudo7.setAuthor("C. Zannier G. Melnik, F. M.");
        estudo7.setTitle("On the success of empirical studies in the international conference on software engineering");
        estudo7.setContent("Critiques of the quantity and quality of empirical evaluations in software engineering have existed for quite some time. However such critiques are typically not empirically evaluated. This paper fills this gap by empirically analyzing papers published by ICSE, the prime research conference on Software Engineering. We present quantitative and qualitative results of a quasi-random experiment of empirical evaluations over the lifetime of the conference. Our quantitative results show the quantity of empirical evaluation has increased over 29 ICSE proceedings but we still have room to improve the soundness of empirical evaluations in ICSE proceedings. Our qualitative results point to specific areas of improvement in empirical evaluations.");
        estudo7.setValues(true);
        list.add(estudo7);
//        list.set(6, estudo);

        Study estudo8 = new Study();
        estudo8.setAuthor("D. Galin, M. A.");
        estudo8.setTitle("Are CMM program investments beneficial? Analyzing past studies");
        estudo8.setContent("Are CMM program investments beneficial? Analyzing past studiesCMM experts strongly believe that investments in programs promoting an organization's CMM maturity yield substantial organizational and economic benefits. In particular, they argue that CMM programs that implement software process improvements can provide more benefits.");
        estudo8.setValues(true);
        list.add(estudo8);
//        list.set(7, estudo);

        Study estudo9 = new Study();
        estudo9.setAuthor("D. Galin, M. A.");
        estudo9.setTitle("Do SQA programs work – CMM works: A meta analysis");
        estudo9.setContent("Many software development professionals and managers of software development organizations re not fully convinced in the profitability of investments for the advancement of SQA systems. The results included in each of the articles we found, cannot lead to general conclusions on the impact of investments in upgrading an SQA system. Our meta analysis was based on CMM level transition (CMMLT) analysis of available publications and was for the seven most common performance metric. The CMMLT analysis is applicable for combined analysis of empirical data from many sources. Each record in our meta analysis database is calculated as “after-before ratio”, which is nearly free of the studied organization’s characteristics.Because the CMM guidelines and SQA requirement are similar, we claim that the results for CMM programs are also applicable to investments in SQA systems The extensive database of over 1,800 projects from a variety of 19 information sources leading to the meta analysis results – proved that investments in CMM programs and similarly in SQA systems contribute to software development performance.");
        estudo9.setValues(true);
        list.add(estudo9);
//        list.set(8, estudo);

        Study estudo10 = new Study();
        estudo10.setAuthor("D. I. K. Sjoeberg J. E. Hannay, O. H. V. B. K. A. K. N. K. L. A. C. R.");
        estudo10.setTitle("A survey of controlled experiments in software engineering");
        estudo10.setContent("The classical method for identifying cause-effect relationships is to conduct controlled experiments. This paper reports upon the present state of how controlled experiments in software engineering are conducted and the extent to which relevant information is reported. Among the 5,453 scientific articles published in 12 leading software engineering journals and conferences in the decade from 1993 to 2002, 103 articles (1.9 percent) reported controlled experiments in which individuals or teams performed one or more software engineering tasks. This survey quantitatively characterizes the topics of the experiments and their subjects (number of subjects, students versus professionals, recruitment, and rewards for participation), tasks (type of task, duration, and type and size of application) and environments (location, development tools). Furthermore, the survey reports on how internal and external validity is addressed and the extent to which experiments are replicated. The gathered data reflects the relevance of software engineering experiments to industrial practice and the scientific maturity of software engineering research.");
        estudo10.setValues(true);
        list.add(estudo10);
//        list.set(9, estudo);

        Study estudo11 = new Study();
        estudo11.setAuthor("Damian, D.");
        estudo11.setTitle("Stakeholders in Global Requirements Engineering: Lessons Learned from Practice");
        estudo11.setContent("Due to its communication and collaboration-intensive nature, as well as inherent interaction with most other development processes, the practice of requirements engineering is becoming a key challenge in global software engineering (GSE). In distributed projects, cross-functional stakeholder groups must specify and manage requirements across cultural, time-zone, and organizational boundaries. This creates a unique set of problems, not only when an organization opens new development subsidiaries across the world but also when software development is a multiorganizational business affair. We need innovative processes and technologies to manage stakeholders' expectations and interaction in global projects. This article reports on the state of the practice, drawn from industrial empirical studies, of stakeholders' interaction in global RE. The article revisits stakeholders' needs in global RE, discusses the challenges they face in distributed interaction, and offers practical advice to alleviate these challenges, as distilled from empirical studies of GSE practice.");
        estudo11.setValues(false);
        list.add(estudo11);
//        list.set(10, estudo);

        Study estudo12 = new Study();
        estudo12.setAuthor("E. Folmer, J. B. B.");
        estudo12.setTitle("Architecting for usability: a survey");
        estudo12.setContent("Over the years the software engineering community has increasingly realized the important role software architecture plays in fulfilling the quality requirements of a system. The quality attributes of a software system are, to a large extent determined by the system’s software architecture. In recent years, the software engineering community has developed various tools and techniques that allow for design for quality attributes, such as performance or maintainability, at the software architecture level. We believe this design approach can be applied not only to “traditional” quality attributes such as performance or maintainability but also to usability. This survey explores the feasibility of such a design approach. Current practice is surveyed from the perspective of a software architect. Are there any design methods that allow for design for usability at the architectural level? Are there any evaluation tools that allow assessment of architectures for their support of usability? What is usability? A framework is presented which visualizes these three research questions. Usability should drive design at all stages, but current usability engineering practice fails to fully achieve this goal. Our survey shows that there are no design techniques or assessment tools that allow for design for usability at the architectural level.");
        estudo12.setValues(false);
        list.add(estudo12);
//        list.set(11, estudo);

        Study estudo13 = new Study();
        estudo13.setAuthor("Gumm, D.");
        estudo13.setTitle("Distribution Dimensions in Software Development Projects: A Taxonomy");
        estudo13.setContent("Distribution in software development projects is a complex phenomenon with many dimensions. In addition to the obvious physical dimension entailed by geographically dispersed project personnel and resources, projects must contend with organizational distribution among various company departments, for example, as well as temporal and stakeholder distributions. A review of the literature on globally distributed software development projects produced a preliminary taxonomy based on a dimensional analysis of distribution. Developers can use this taxonomy to identify and visualize their project's distribution dimensions and scopes. A real-world case study of the taxonomy's use illuminates its value, as well as common challenges and possible solutions to distribution problems.This article is part of a special issue on Global Software Development.");
        estudo13.setValues(false);
        list.add(estudo13);
//        list.set(12, estudo);

        Study estudo14 = new Study();
        estudo14.setAuthor("H. Lorin, L. M.");
        estudo14.setTitle("Combating architectural degeneration: a survey");
        estudo14.setContent("As software systems evolve over time, they invariably undergo changes that can lead to a degeneration of the architecture. Left unchecked, degeneration may reach a level where a complete redesign is necessary, a task that requires significant effort. In this paper, we present a survey of technologies developed by researchers that can be used to combat degeneration, that is, technologies that can be employed in identifying, treating and researching degeneration. We also discuss the various causes of degeneration and how it can be prevented.");
        estudo14.setValues(false);
        list.add(estudo14);
//        list.set(13, estudo);

        Study estudo15 = new Study();
        estudo15.setAuthor("H. Petersson T. Thelin, P. R. C. W.");
        estudo15.setTitle("Capture–recapture in software inspections after 10 years research – theory, evaluation and application");
        estudo15.setContent("Software inspection is a method to detect faults in the early phases of the software life cycle. In order to estimate the number of faults not found, capture–recapture was introduced for software inspections in 1992 to estimate remaining faults after an inspection. Since then, several papers have been written in the area, concerning the basic theory, evaluation of models and application of the method. This paper summarizes the work made in capture–recapture for software inspections during these years. Furthermore, and more importantly, the contribution of the papers are classified as theory, evaluation or application, in order to analyse the performed research as well as to highlight the areas of research that need further work. It is concluded that (1) most of the basic theory is investigated within biostatistics, (2) most software engineering research is performed on evaluation, a majority ending up in recommendation of the Mh–JK model, and (3) there is a need for application experiences. In order to support the application, an inspection process is presented with decision points based on capture–recapture estimates.");
        estudo5.setValues(true);
        list.add(estudo15);
//        list.set(14, estudo);

        Study estudo16 = new Study();
        estudo16.setAuthor("J. E. Hannay D. I. K. Sjoberg, T. D.");
        estudo16.setTitle("A systematic review of theory use in software engineering experiments");
        estudo16.setContent("Empirically based theories are generally perceived as foundational to science. However, in many disciplines, the nature, role and even the necessity of theories remain matters for debate, particularly in young or practical disciplines such as software engineering. This article reports a systematic review of the explicit use of theory in a comprehensive set of 103 articles reporting experiments, from of a total of 5,453 articles published in major software engineering journals and conferences in the decade 1993-2002. Of the 103 articles, 24 use a total of 40 theories in various ways to explain the cause-effect relationship(s) under investigation. The majority of these use theory in the experimental design to justify research questions and hypotheses, some use theory to provide post hoc explanations of their results, and a few test or modify theory. A third of the theories are proposed by authors of the reviewed articles. The interdisciplinary nature of the theories used is greater than that of research in software engineering in general. We found that theory use and awareness of theoretical issues are present, but that theory-driven research is, as yet, not a major issue in empirical software engineering. Several articles comment explicitly on the lack of relevant theory. We call for an increased awareness of the potential benefits of involving theory, when feasible. To support software engineering researchers who wish to use theory, we show which of the reviewed articles on which topics use which theories for what purposes, as well as details of the theories' characteristics.");
        estudo16.setValues(true);
        list.add(estudo16);
//        list.set(15, estudo);

        Study estudo17 = new Study();
        estudo17.setAuthor("J. Estublier D. Leblang, A. H. R. C. G. C. W. T. D. W.-W.");
        estudo17.setTitle("Impact of software engineering research on the practice of software configuration management");
        estudo17.setContent("SCM (Software Configuration Management) is arguably one of the most successful software engineering disciplines. It is difficult to imagine this kind of success would have prevailed without research fueling continuous innovations. This paper demonstrates that the impact of this research, whether industrial or academic in nature, is undeniable - most fundamental techniques underlying current SCM systems were first published in one form or another. Like any other field, SCM research has had its successes and failures. Certain ideas are universally adopted, others have had limited impact, and yet others never saw fruition. Timing has been critical: whereas some contributions could immediately be related to practical, day-to-day problems, others were too early for their time and not practically relevant for the problems then at hand.");
        estudo17.setValues(false);
        list.add(estudo17);
//        list.set(16, estudo);

        Study estudo18 = new Study();
        estudo18.setAuthor("J. Ma, J. V. N.");
        estudo18.setTitle("Hands-on, simulated and remote laboratories: a comparative literature review");
        estudo18.setContent("Laboratory-based courses play a critical role in scientific education. Automation is changing the nature of these laboratories, and there is a long-running debate about the value of hands-on versus simulated laboratories. In addition, the introduction of remote laboratories adds a third category to the debate. Through a review of the literature related to these labs in education, the authors draw several conclusions about the state of current research. The debate over different technologies is confounded by the use of different educational objectives as criteria for judging the laboratories: Hands-on advocates emphasize design skills, while remote lab advocates focus on conceptual understanding. We observe that the boundaries among the three labs are blurred in the sense that most laboratories are mediated by computers, and that the psychology of presence may be as important as technology. We also discuss areas for future research.");
        estudo18.setValues(false);
        list.add(estudo18);
//        list.set(17, estudo);

        Study estudo19 = new Study();
        estudo19.setAuthor("Jorgensen, M.");
        estudo19.setTitle("Estimation of software development work effort: evidence on expert judgement and formal models");
        estudo19.setContent("The review presented in this paper examines the evidence on the use of expert judgement, formal models, and a combination of these two approaches when estimating (forecasting) software development work effort. Sixteen relevant studies were identified and reviewed. The review found that the average accuracy of expert judgement-based effort estimates was higher than the average accuracy of the models in ten of the sixteen studies. Two indicators of higher accuracy of judgement-based effort estimates were estimation models not calibrated to the organization using the model, and important contextual information possessed by the experts not included in the formal estimation models. Four of the reviewed studies evaluated effort estimates based on a combination of expert judgement and models. The mean estimation accuracy of the combination-based methods was similar to the best of that of the other estimation methods.");
        estudo19.setValues(true);
        list.add(estudo19);
//        list.set(18, estudo);

        Study estudo20 = new Study();
        estudo20.setAuthor("Jorgensen, M.");
        estudo20.setTitle("A review of studies on expert estimation of software development effort");
        estudo20.setContent("This paper provides an extensive review of studies related to expert estimation of software development effort. The main goal and contribution of the review is to support the research on expert estimation, e.g., to ease other researcher's search for relevant expert estimation studies. In addition, we provide software practitioners with useful estimation guidelines, based on the research-based knowledge of expert estimation processes. The review results suggest that expert estimation is the most frequently applied estimation strategy for software projects, that there is no substantial evidence in favour of use of estimation models, and that there are situations where we can expect expert estimates to be more accurate than formal estimation models. The following 12 expert estimation \"best practice\" guidelines are evaluated through the review: (1) evaluate estimation accuracy, but avoid high evaluation pressure; (2) avoid conflicting estimation goals; (3) ask the estimators to justify and criticize their estimates; (4) avoid irrelevant and unreliable estimation information; (5) use documented data from previous development tasks; (6) find estimation experts with relevant domain background and good estimation records; (7) Estimate top-down and bottom-up, independently of each other; (8) use estimation checklists; (9) combine estimates from different experts and estimation strategies; (10) assess the uncertainty of the estimate; (11) provide feedback on estimation accuracy and development task relations; and, (12) provide estimation training opportunities. We found supporting evidence for all 12 estimation principles, and provide suggestions on how to implement them in software organizations.");
        estudo20.setValues(true);
        list.add(estudo20);
//        list.set(19, estudo);

        Study estudo21 = new Study();
        estudo21.setAuthor("K. Moloekken-OEstvold M. Joergensen, S. S. T. H. G. A. C. L. S. W. H.");
        estudo21.setTitle("A survey on software estimation in the Norwegian industry");
        estudo21.setContent("We provide an overview of the estimation methods that software companies apply to estimate their projects, why those methods are chosen, and how accurate they are. In order to improve estimation accuracy, such knowledge is essential. We conducted an in-depth survey, where information was collected through structured interviews with senior managers from 18 different companies and project managers of 52 different projects. We analyzed information about estimation approach, effort estimation accuracy and bias, schedule estimation accuracy and bias, delivered functionality and other estimation related information. Our results suggest, for example, that average effort overruns are 41%, that the estimation performance has not changed much the last 10-20 years, that expert estimation is the dominating estimation method, that estimation accuracy is not much impacted by use of formal estimation models, and that software managers tend to believe that the estimation accuracy of their company is better than it actually is.");
        estudo21.setValues(true);
        list.add(estudo21);
//        list.set(20, estudo);

        Study estudo22 = new Study();
        estudo22.setAuthor("M. Jorgensen, M. S.");
        estudo22.setTitle("A systematic review of software development cost estimation studies");
        estudo22.setContent("This paper aims to provide a basis for the improvement of software estimation research through a systematic review of previous work. The review identifies 304 software cost estimation papers in 76 journals and classifies the papers according to research topic, estimation approach, research approach, study context and data set. A Web-based library of these cost estimation papers is provided to ease the identification of relevant estimation research results. The review results combined with other knowledge provide support for recommendations for future software cost estimation research, including 1) increase the breadth of the search for relevant studies, 2) search manually for relevant papers within a carefully selected set of journals when completeness is essential, 3) conduct more studies on estimation methods commonly used by the software industry, and 4) increase the awareness of how properties of the data sets impact the results when evaluating estimation methods.");
        estudo22.setValues(true);
        list.add(estudo22);
//        list.set(21, estudo);

        Study estudo23 = new Study();
        estudo23.setAuthor("M. Shaw, P. C.");
        estudo23.setTitle("The golden age of software architecture");
        estudo23.setContent("Since the late 1980s, software architecture has emerged as the principled understanding of the large-scale structures of software systems. From its roots in qualitative descriptions of empirically observed useful system organizations, software architecture has matured to encompass a broad set of notations, tools, and analysis techniques. Whereas initially the research area interpreted software practice, it now offers concrete guidance for complex software design and development. It has made the transition from basic research to an essential element of software system design and construction. This retrospective examines software architecture's growth in the context of a technology maturation model, matching its significant accomplishments to the model's stages to gain perspective on where the field stands today. This trajectory has taken architecture to its golden age.");
        estudo23.setValues(false);
        list.add(estudo23);
//        list.set(22, estudo);

        Study estudo24 = new Study();
        estudo24.setAuthor("M. Torchiano, M. M.");
        estudo24.setTitle("Overlooked aspects of COTS-based development");
        estudo24.setContent("Although developing with commercial-off-the-shelf components is gaining more attention from both research and industrial communities, most literature on the topic doesn't clearly identify context variables such as the type of products, projects, and systems. In particular, the literature often lacks a definition of \"COTS product,\" or, when a definition is present, it invariably disagrees with other studies. A shared definition would improve discourse and enable researchers to meta-analyze published empirical data. After a speculative effort to define and classify COTS products, we decided to obtain this much-needed understanding from the bottom up. We asked people involved in industrial projects to name the key features in COTS-based development and to tell us what they think constitutes a COTS product. We present the interview results in the form of six theses, which contradict widely accepted (or simply undisputed) ideas. We also present a definition of \"COTS product\" that captures the key features.");
        estudo24.setValues(true);
        list.add(estudo24);
//        list.set(23, estudo);

        Study estudo25 = new Study();
        estudo25.setAuthor("Mendes, E.");
        estudo25.setTitle("Systematic review of Web engineering research");
        estudo25.setContent("This paper uses a systematic literature review as means of investigating the rigor of claims arising from Web engineering research. Rigor is measured using criteria combined from software engineering research. We reviewed 173 papers and results have shown that only 5% would be considered rigorous methodologically. In addition to presenting our results, we also provide suggestions for improvement of Web engineering research based on lessons learnt by the software engineering community.");
        estudo25.setValues(true);
        list.add(estudo25);
//        list.set(24, estudo);

        Study estudo26 = new Study();
        estudo26.setAuthor("N. Juristo A. M. Moreno, S. V.");
        estudo26.setTitle("Reviewing 25 years of testing technique experiments");
        estudo26.setContent("Mature knowledge allows engineering disciplines the achievement of predictable results. Unfortunately, the type of knowledge used in software engineering can be considered to be of a relatively low maturity, and developers are guided by intuition, fashion or market-speak rather than by facts or undisputed statements proper to an engineering discipline. Testing techniques determine different criteria for selecting the test cases that will be used as input to the system under examination, which means that an effective and efficient selection of test cases conditions the success of the tests. The knowledge for selecting testing techniques should come from studies that empirically justify the benefits and application conditions of the different techniques. This paper analyzes the maturity level of the knowledge about testing techniques by examining existing empirical studies about these techniques. We have analyzed their results, and obtained a testing technique knowledge classification based on their factuality and objectivity, according to four parameters.");
        estudo26.setValues(true);
        list.add(estudo26);
//        list.set(25, estudo);

        Study estudo27 = new Study();
        estudo27.setAuthor("N. Juristo A. M. Moreno, S. V. M. S.");
        estudo27.setTitle("In search of what we experimentally know about unit testing");
        estudo27.setContent("Gathering evidence in any discipline is a lengthy procedure, requiring experimentation and empirical confirmation to transform information from mere opinion to undisputed fact. Software engineering is a relatively young field and experimental SE is even younger, so undisputed facts are few and far between. Nevertheless, ESE's relevance is growing because experimental results can help practitioners make better decisions. We have aggregated results from unit-testing experiments with the aim of identifying information with some experimental basis that might help practitioners make decisions. Most of the experiments focus on two important characteristics of testing techniques: effectiveness and efficiency. Some other experiments study the quality of test-case sets according to different criteria.");
        estudo27.setValues(true);
        list.add(estudo27);
//        list.set(26, estudo);

        Study estudo28 = new Study();
        estudo28.setAuthor("P. Runeson C. Andersson, T. T. A. A. T. B.");
        estudo28.setTitle("What do we know about defect detection methods?");
        estudo28.setContent("A survey of defect detection studies comparing inspection and testing techniques yields practical recommendations: use inspections for requirements and design defects, and use testing for code. Evidence-based software engineering can help software practitioners decide which methods to use and for what purpose. EBSE involves defining relevant questions, surveying and appraising avail able empirical evidence, and integrating and evaluating new practices in the target environment. This article helps define questions regarding defect detection techniques and presents a survey of empirical studies on testing and inspection techniques. We then interpret the findings in terms of practical use. The term defect always relates to one or more underlying faults in an artifact such as code. In the context of this article, defects map to single faults.");
        estudo28.setValues(true);
        list.add(estudo28);
//        list.set(27, estudo);

        Study estudo29 = new Study();
        estudo29.setAuthor("R. L. Glass V. Ramesh, I. V.");
        estudo29.setTitle("An analysis of research in computing disciplines");
        estudo29.setContent("Comparing the topics and methods of the three major subdivisions of the computing realm.");
        estudo29.setValues(true);
        list.add(estudo29);
//        list.set(28, estudo);

        Study estudo30 = new Study();
        estudo30.setAuthor("S. Balsamo A. Di Marco, P. I. M. S.");
        estudo30.setTitle("Model-Based Performance Prediction in Software Development: A Survey");
        estudo30.setContent("Over the last decade, a lot of research has been directed toward integrating performance analysis into the software development process. Traditional software development methods focus on software correctness, introducing performance issues later in the development process. This approach does not take into account the fact that performance problems may require considerable changes in design, for example, at the software architecture level, or even worse at the requirement analysis level. Several approaches were proposed in order to address early software performance analysis. Although some of them have been successfully applied, we are still far from seeing performance analysis integrated into ordinary software development. In this paper, we present a comprehensive review of recent research in the field of model-based performance prediction at software development time in order to assess the maturity of the field and point out promising research directions.");
        estudo30.setValues(false);
        list.add(estudo30);
//        list.set(29, estudo);

        Study estudo31 = new Study();
        estudo31.setAuthor("S. Grimstad M. Jørgensen, K. J. M.-Ø.");
        estudo31.setTitle("Software effort estimation terminology: the tower of Babel");
        estudo31.setContent("It is well documented that the software industry suffers from frequent cost overruns. A contributing factor is, we believe, the imprecise estimation terminology in use. A lack of clarity and precision in the use of estimation terms reduces the interpretability of estimation accuracy results, makes the communication of estimates difficult, and lowers the learning possibilities. This paper reports on a structured review of typical software effort estimation terminology in software engineering textbooks and software estimation research papers. The review provides evidence that the term ‘effort estimate’ is frequently used without sufficient clarification of its meaning, and that estimation accuracy is often evaluated without ensuring that the estimated and the actual effort are comparable. Guidelines are suggested on how to reduce this lack of clarity and precision in terminology.");
        estudo31.setValues(true);
        list.add(estudo31);
//        list.set(30, estudo);

        Study estudo32 = new Study();
        estudo32.setAuthor("S. Mahmood R. Lai, Y. S. K.");
        estudo32.setTitle("Survey of component-based software development");
        estudo32.setContent("Because of the extensive uses of components, the Component-Based Software Engineering (CBSE) process is quite different from that of the traditional waterfall approach. CBSE not only requires focus on system specification and development, but also requires additional consideration for overall system context, individual components properties and component acquisition and integration process. The term component-based software development (CBD) can be referred to as the process for building a system using components. CBD life cycle consists of a set of phases, namely, identifying and selecting components based on stakeholder requirements, integrating and assembling the selected components and updating the system as components evolve over time with newer versions. This work presents an indicative literature survey of techniques proposed for different phases of the CBD life cycle. The aim of this survey is to help provide a better understanding of different CBD techniques for each of these areas.");
        estudo32.setValues(false);
        list.add(estudo32);
//        list.set(31, estudo);

        Study estudo33 = new Study();
        estudo33.setAuthor("S. Mahmood R. Lai, Y. S. K. J. H. K. S. C. P. H. S. O.");
        estudo33.setTitle("A survey of component based system quality assurance and assessment");
        estudo33.setContent("Component Based Software Development (CBSD) is focused on assembling existing components to build a software system, with a potential benefit of delivering quality systems by using quality components. It departs from the conventional software development process in that it is integration centric as opposed to development centric. The quality of a component based system using high quality components does not therefore necessarily guarantee a system of high quality, but depends on the quality of its components, and a framework and integration process used. Hence, techniques and methods for quality assurance and assessment of a component based system would be different from those of the traditional software engineering methodology. It is essential to quantify factors that contribute to the overall quality, for instances, the trade off between cost and quality of a component, analytical techniques and formal methods, and quality attribute definitions and measurements. This paper presents a literature survey of component based system quality assurance and assessment; the areas surveyed include formalism, cost estimation, and assessment and measurement techniques for the following quality attributes: performance, reliability, maintainability and testability. The aim of this survey is to help provide a better understanding of CBSD in these aspects in order to facilitate the realisation of its potential benefits of delivering quality systems.");
        estudo33.setValues(false);
        list.add(estudo33);
//        list.set(32, estudo);

        Study estudo34 = new Study();
        estudo34.setAuthor("T. Dyba V. B. Kampenes, D. I. K. S.");
        estudo34.setTitle("A systematic review of statistical power in software engineering experiments");
        estudo34.setContent("Statistical power is an inherent part of empirical studies that employ significance testing and is essential for the planning of studies, for the interpretation of study results, and for the validity of study conclusions. This paper reports a quantitative assessment of the statistical power of empirical software engineering research based on the 103 papers on controlled experiments (of a total of 5,453 papers) published in nine major software engineering journals and three conference proceedings in the decade 1993–2002. The results show that the statistical power of software engineering experiments falls substantially below accepted norms as well as the levels found in the related discipline of information systems research. Given this study's findings, additional attention must be directed to the adequacy of sample sizes and research designs to ensure acceptable levels of statistical power. Furthermore, the current reporting of significance tests should be enhanced by also reporting effect sizes and confidence intervals.");
        estudo34.setValues(true);
        list.add(estudo34);
//        list.set(33, estudo);

        Study estudo35 = new Study();
        estudo35.setAuthor("Tom Mens, T. T.");
        estudo35.setTitle("A survey of software refactoring");
        estudo35.setContent("We provide an extensive overview of existing research in the field of software refactoring. This research is compared and discussed based on a number of different criteria: the refactoring activities that are supported, the specific techniques and formalisms that are used for supporting these activities, the types of software artifacts that are being refactored, the important issues that need to be taken into account when building refactoring tool support, and the effect of refactoring on the software process. A running example is used to explain and illustrate the main concepts.");
        estudo35.setValues(false);
        list.add(estudo35);
//        list.set(34, estudo);

        Study estudo36 = new Study();
        estudo36.setAuthor("V. Ramesh R. L. Glass, I. V.");
        estudo36.setTitle("Research in computer science: an empirical study");
        estudo36.setContent("In this paper, we examine the state of computer science (CS) research from the point of view of the following research questions: What topics do CS researchers address? What research approaches do CS researchers use? What research methods do CS researchers use? On what reference disciplines does CS research depend? At what levels of analysis do CS researchers conduct research? To answer these questions, we examined 628 papers published between 1995 and 1999 in 13 leading research journals in the CS field. Our results suggest that while CS research examines a variety of technical topics it is relatively focused in terms of the level at which research is conducted as well as the research techniques used. Further, CS research seldom relies on work outside the discipline for its theoretical foundations. We present our findings as an evaluation of the state of current research and as groundwork for future CS research efforts.");
        estudo36.setValues(true);
        list.add(estudo36);
//        list.set(35, estudo);

        Study estudo37 = new Study();
        estudo37.setAuthor("Wagner, S.");
        estudo37.setTitle("A literature survey of the quality economics of defect-detection techniques");
        estudo37.setContent("Over the last decades, a considerable amount of empirical knowledge about the efficiency of defect-detection techniques has been accumulated. Also a few surveys have summarised those studies with different focuses, usually for a specific type of technique. This work reviews the results of empirical studies and associates them with a model of software quality economics. This allows a better comparison of the different techniques and supports the application of the model in practice as several parameters can be approximated with typical average values. The main contributions are the provision of average values of several interesting quantities w.r.t. defect detection and the identification of areas that need further research because of the limited knowledge available.");
        estudo37.setValues(false);
        list.add(estudo37);
//        list.set(36, estudo);

        return list;
    }

}
