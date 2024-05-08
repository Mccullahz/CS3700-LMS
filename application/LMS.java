package application;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.List;
import java.util.ArrayList;

import javax.swing.JList;
// import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Lani/Kala
 */
public class LMS extends javax.swing.JFrame {
    /*Things that need to be finished/addressed:
    The remove/edit/search tab
    
    1.  Figure out how the Jlist modeling works
    2.  The BookStrList SHOULD be what makes up the JList. I'm thinking it should 
        be built from calling the title and publisher variables from each book and 
        concatentating them together, then adding those into a string array.
    3.  This string array should be used in the JList, while the BookList array should be
        updates simultaneously
    4.  My idea was to have the edit button open up a tabbed panel wherein each panel
        correlates to a specific book type, however this is NOT working, so it will likely
        need to be replaced with something else
    
    Adding book tab
    1.  Again, need help figuring out Jlists. We're going to have alot of lists
        considering all the complex classes that are being made (I.E, Committee members,
        author lists)
    2.  Example of the above is going to be the author name adding list. I'm thinking
        the idea here is that it accepts first and last name together, then splits
        them so they can be added separately like they are defined in the classes
    3.  I have some example sections completed, but there's a lot left to do
    
    Generating report
    1.  This is almost done, just need book classes to be implemented, the code 
        SHOULD work.
    2.  The important thing the existing code uses that I'm pretty sure doesn't exist
        in the class files yet is the toString method. Once those are made for
        each and every class, then we'll be good.
    */
    
    // //Updated list containing title + publisher, used in remove book and book editor
    // private final List<String> BookStrList = new ArrayList<>();
    // //private finale List<Publication> BookList = new ArrayList<>(); <--NOTE, NEEDS IMPLEMENTATION
    // DefaultListModel  = new DefaultListModel();

    /**
     * Creates new form LMS
     */
    public LMS() {
        initComponents();
    }
    
    // Variables
    //Super lists, we will be editting, adding, and removing from these!!!
    List<Book> bookSuper = new ArrayList<Book>();
    List<Thesis> thesisSuper = new ArrayList<Thesis>();
    List<Dissertation> dissertationSuper = new ArrayList<Dissertation>();
    List<ConferencePaper> conferenceSuper = new ArrayList<ConferencePaper>();
    List<JournalPaper> journalSuper = new ArrayList<JournalPaper>();
    List<ResearchReport> researchSuper = new ArrayList<ResearchReport>();
    List<Magazine> magazineSuper = new ArrayList<Magazine>();


    //Filter Lists, these are the "filters" we will use to take txt box inputs from user to find SUPER obj to find/edit
    List<Book> bookFilter = new ArrayList<Book>();
    List<Thesis> thesisFitler = new ArrayList<Thesis>();
    List<Dissertation> dissertationFilter = new ArrayList<Dissertation>();
    List<ConferencePaper> conferenceFilter = new ArrayList<ConferencePaper>();
    List<JournalPaper> journalFilter = new ArrayList<JournalPaper>();
    List<ResearchReport> researchFilter = new ArrayList<ResearchReport>();
    List<Magazine> magazineFilter = new ArrayList<Magazine>();

    //Show JLists
    JList<Book> bookList;
    JList<Thesis> thesisList;
    JList<Dissertation> dissertationList;
    JList<ConferencePaper> conferenceList;
    JList<JournalPaper> journalList;
    JList<ResearchReport> researchList;
    JList<Magazine> magazineList;


    //Use this function to iterate through item sin the JTextField for author/commitee member lists
    public List<Author> setAuthors(String txtField){
        List<Author> author = new ArrayList<Author>();
        String[] arrAuthors = txtField.split(";");
        for(String a : arrAuthors){
            String[] arrName = a.split(" ");
            author.add(new Author(arrName[0], arrName[1]));
        }
        return author;
    }


    public List<CommitteeMember> setCommitteeMems(String txtField){
        List<CommitteeMember> cmem = new ArrayList<CommitteeMember>();
        String[] arrMembers = txtField.split(";");
        for(String a : arrMembers){
            String[] arrChar = a.split(" ");
            cmem.add(new CommitteeMember(arrChar[0], arrChar[1], arrChar[2]));
        }
        return cmem;
    }

    

    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);   
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RootPanel = new javax.swing.JPanel();
        MultiPaneLMS = new javax.swing.JTabbedPane();
        SearchPane = new javax.swing.JPanel();
        SearchTabbedPanel = new javax.swing.JTabbedPane();
        SearchBookPanel = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        SearchBookList = new javax.swing.JList<>();
        SearchBookTitleLabel = new javax.swing.JLabel();
        searchBookTitleTxt = new javax.swing.JTextField();
        SearchBookEdNumLabel = new javax.swing.JLabel();
        searchBookEdNumTxt = new javax.swing.JTextField();
        SearchBookPubYearLabel = new javax.swing.JLabel();
        searchBookPubYearTxt = new javax.swing.JTextField();
        SearchBookChapLabel = new javax.swing.JLabel();
        searchBookChapTxt = new javax.swing.JTextField();
        SearchBookFigsLabel = new javax.swing.JLabel();
        searchBookFigsTxt = new javax.swing.JTextField();
        SearchBookPubLabel = new javax.swing.JLabel();
        searchBookPubTxt = new javax.swing.JTextField();
        SearchBookAuthorLabel = new javax.swing.JLabel();
        searchBookAuthorTxt = new javax.swing.JTextField();
        searchBookBtn = new javax.swing.JButton();
        confirmEditBookBtn = new javax.swing.JButton();
        SearchThesisPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        SearchThesisList = new javax.swing.JList<>();
        searchThesisDepTxt = new javax.swing.JTextField();
        SearchThesisDepLabel = new javax.swing.JLabel();
        SearchThesisTitleLabel = new javax.swing.JLabel();
        searchThesisTitleTxt = new javax.swing.JTextField();
        SearchThesisPubYearLabel = new javax.swing.JLabel();
        searchThesisPubYearTxt = new javax.swing.JTextField();
        SearchThesisChapLabel = new javax.swing.JLabel();
        searchThesisChapTxt = new javax.swing.JTextField();
        SearchThesisFigsLabel = new javax.swing.JLabel();
        searchThesisFigsTxt = new javax.swing.JTextField();
        SearchThesisAuthorLabel = new javax.swing.JLabel();
        searchThesisAuthorTxt = new javax.swing.JTextField();
        SearchThesisCommitteeMemLabel = new javax.swing.JLabel();
        searchThesisCommitteeMemTxt = new javax.swing.JTextField();
        searchThesisBtn = new javax.swing.JButton();
        confirmEditThesisBtn = new javax.swing.JButton();
        SearchThesisBuildLabel = new javax.swing.JLabel();
        searchThesisBuildTxt = new javax.swing.JTextField();
        SearchDissertationPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        SearchDissertationList = new javax.swing.JList<>();
        searchDisseratationTitleTxt = new javax.swing.JTextField();
        SearchDissertationTitleLabel = new javax.swing.JLabel();
        SearchDissertationDepLabel = new javax.swing.JLabel();
        searchDissertationDepTxt = new javax.swing.JTextField();
        searchDissertationPubYearTxt = new javax.swing.JTextField();
        SearchDissertationPubYearLabel = new javax.swing.JLabel();
        SearchDissertationChapLabel = new javax.swing.JLabel();
        searchDissertationChapTxt = new javax.swing.JTextField();
        SearchDissertationCommitteeMemLabel = new javax.swing.JLabel();
        searchDissertationCommitteeMemTxt = new javax.swing.JTextField();
        searchDissertationBtn = new javax.swing.JButton();
        searchDissertationFigsTxt = new javax.swing.JTextField();
        SearchDissertationFigsLabel = new javax.swing.JLabel();
        SearchDissertationAuthorLabel = new javax.swing.JLabel();
        searchDissertationAuthorTxt = new javax.swing.JTextField();
        confirmEditDissertationBtn = new javax.swing.JButton();
        searchDissertationBuildingLabel = new javax.swing.JLabel();
        searchDissertationBuildTxt = new javax.swing.JTextField();
        SearchConferencePanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        SearchConferenceList = new javax.swing.JList<>();
        SearchConferenceAuthorLabel = new javax.swing.JLabel();
        searchConferenceAuthorTxt = new javax.swing.JTextField();
        searchConferenceBtn = new javax.swing.JButton();
        SearchConferenceNameLabel = new javax.swing.JLabel();
        searchConferencePubYearTxt = new javax.swing.JTextField();
        SearchConferenceTitleLabel = new javax.swing.JLabel();
        searchConferenceTitleTxt = new javax.swing.JTextField();
        SearchConferencePublicationLabel = new javax.swing.JLabel();
        searchConferenceNameTxt = new javax.swing.JTextField();
        searchConferenceEndDateLabel = new javax.swing.JLabel();
        searchConferenceBeginDateLabel = new javax.swing.JLabel();
        searchConferenceBeginDateFrmtTxt = new javax.swing.JFormattedTextField();
        searchConferenceEndDateFrmtTxt = new javax.swing.JFormattedTextField();
        confirmEditConferenceBtn = new javax.swing.JButton();
        SearchJournalPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        SearchJournalList = new javax.swing.JList<>();
        searchJournalBtn = new javax.swing.JButton();
        searchJournalTitleTxt = new javax.swing.JTextField();
        SearchJournalTitleLabel = new javax.swing.JLabel();
        SearchJournalAuthorLabel = new javax.swing.JLabel();
        searchJournalAuthorTxt = new javax.swing.JTextField();
        SearchJournalNameLabel = new javax.swing.JLabel();
        searchJournalNameTxt = new javax.swing.JTextField();
        searchJournalPubYearTxt = new javax.swing.JTextField();
        SearchJournalPubYearLabel = new javax.swing.JLabel();
        confirmEditJournalBtn = new javax.swing.JButton();
        SearchResearchPanel = new javax.swing.JPanel();
        SearchResearchPalettePanel = new javax.swing.JPanel();
        SearchResearchTitleLabel = new javax.swing.JLabel();
        searchResearchTitleTxt = new javax.swing.JTextField();
        SearchResearchAuthorLabel = new javax.swing.JLabel();
        searchResearchAuthorTxt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        SearchResearchList = new javax.swing.JList<>();
        searchResearchBtn = new javax.swing.JButton();
        searchResearchPubYearTxt = new javax.swing.JTextField();
        SearchResearchPubYearLabel = new javax.swing.JLabel();
        confirmEditResearchBtn = new javax.swing.JButton();
        SearchMagazinePanel = new javax.swing.JPanel();
        SearchMagazinePalettePanel = new javax.swing.JPanel();
        SearchMagazineTitleLablel = new javax.swing.JLabel();
        searchMagazineTitleTxt = new javax.swing.JTextField();
        MagazineSearchList = new javax.swing.JScrollPane();
        SearchMagazineList = new javax.swing.JList<>();
        searchMagazineBtn = new javax.swing.JButton();
        searchMagazinePubYearTxt = new javax.swing.JTextField();
        SearchMagazinePubYearLabel = new javax.swing.JLabel();
        confirmEditMagazineBtn = new javax.swing.JButton();
        ItmSearchLabel = new javax.swing.JLabel();
        ItmSearchDescLabel = new javax.swing.JLabel();
        AddRemovePane = new javax.swing.JPanel();
        EditItemPanel = new javax.swing.JTabbedPane();
        AddItemPanel = new javax.swing.JPanel();
        AddItemTabbedPane = new javax.swing.JTabbedPane();
        AddBookPanel = new javax.swing.JPanel();
        AddBookTitleLabel = new javax.swing.JLabel();
        addBookTitleTxt = new javax.swing.JTextField();
        AddBookEdNumLabel = new javax.swing.JLabel();
        addBookEdNumTxt = new javax.swing.JTextField();
        AddBookPubYearLabel = new javax.swing.JLabel();
        addBookPubYearTxt = new javax.swing.JTextField();
        AddBookChapLabel = new javax.swing.JLabel();
        addBookChapTxt = new javax.swing.JTextField();
        AddBookFigLabel = new javax.swing.JLabel();
        addBookFigsTxt = new javax.swing.JTextField();
        AddBookPubLabel = new javax.swing.JLabel();
        addBookPubTxt = new javax.swing.JTextField();
        AddBookAuthorLabel = new javax.swing.JLabel();
        addBookAuthorListTxt = new javax.swing.JTextField();
        AddBookAuthorInstructionLabel = new javax.swing.JLabel();
        addBookBtn = new javax.swing.JButton();
        AddThesisPanel = new javax.swing.JPanel();
        addThesisTitleLabel = new javax.swing.JLabel();
        addThesisTitleTxt = new javax.swing.JTextField();
        AddThesisPubYear = new javax.swing.JLabel();
        addThesisPubYearTxt = new javax.swing.JTextField();
        AddThesisDepLabel = new javax.swing.JLabel();
        addThesisDepTxt = new javax.swing.JTextField();
        AddThesisChapLabel = new javax.swing.JLabel();
        addThesisChapTxt = new javax.swing.JTextField();
        AddThesisFigLabel = new javax.swing.JLabel();
        addThesisFigsTxt = new javax.swing.JTextField();
        AddThesisAuthorLabel = new javax.swing.JLabel();
        addThesisAuthorTxt = new javax.swing.JTextField();
        AddThesisCommitteeMemInstructionLabel = new javax.swing.JLabel();
        AddThesisCommitteeMemLabel = new javax.swing.JLabel();
        addThesisCommitteeMemsTxt = new javax.swing.JTextField();
        addThesisBtn = new javax.swing.JButton();
        AddThesisBuildLabel = new javax.swing.JLabel();
        addThesisBuildTxt = new javax.swing.JTextField();
        AddDissertationPanel = new javax.swing.JPanel();
        addDissertationTitleLabel = new javax.swing.JLabel();
        addDissertationTitleTxt = new javax.swing.JTextField();
        AddDissertationPubYearLabel = new javax.swing.JLabel();
        addDissertationPubYearTxt = new javax.swing.JTextField();
        AddDissertationDepLabel = new javax.swing.JLabel();
        addDissertationDepTxt = new javax.swing.JTextField();
        AddDissertationChapLabel = new javax.swing.JLabel();
        addDissertationChapTxt = new javax.swing.JTextField();
        AddDissertationFigsLabel = new javax.swing.JLabel();
        addDissertationFigsTxt = new javax.swing.JTextField();
        AddDissertationAuthorLabel = new javax.swing.JLabel();
        addDissertationAuthorTxt = new javax.swing.JTextField();
        AddDissertationCommitteeMemInstructionLabel = new javax.swing.JLabel();
        AddDissertationCommitteeMemLabel = new javax.swing.JLabel();
        addDissertationCommitteeMemsTxt = new javax.swing.JTextField();
        addDissertationBtn = new javax.swing.JButton();
        AddDissertationBuildLabel = new javax.swing.JLabel();
        addDissertationBuildTxt = new javax.swing.JTextField();
        AddConferencePanel = new javax.swing.JPanel();
        addConferenceTitleTxt = new javax.swing.JTextField();
        addConferenceTitleLabel = new javax.swing.JLabel();
        AddConferencePubYearLabel = new javax.swing.JLabel();
        addConferencePubYearTxt = new javax.swing.JTextField();
        addConferenceNameTxt = new javax.swing.JTextField();
        AddConferenceNameLabel = new javax.swing.JLabel();
        addConferenceStartDateLabel = new javax.swing.JLabel();
        addConferenceBtn = new javax.swing.JButton();
        addConferenceLocationLabel = new javax.swing.JLabel();
        addConferenceLocationTxt = new javax.swing.JTextField();
        addConferenceAuthorListTxt = new javax.swing.JTextField();
        AddConferenceAuthorLabel = new javax.swing.JLabel();
        AddConferenceAuthorInstructionLabel = new javax.swing.JLabel();
        addConferenceBeginDateFrmtTxt = new javax.swing.JFormattedTextField();
        addConferenceEndDateFrmtTxt = new javax.swing.JFormattedTextField();
        addConferenceEndDateLabel = new javax.swing.JLabel();
        AddJournalPanel = new javax.swing.JPanel();
        addJournalAuthorListTxt = new javax.swing.JTextField();
        AddJournalAuthorLabel = new javax.swing.JLabel();
        AddJournalAuthorInstructionLabel = new javax.swing.JLabel();
        addJournalBtn = new javax.swing.JButton();
        addJournalPubYearLabel = new javax.swing.JLabel();
        addJournalPubYearTxt = new javax.swing.JTextField();
        addJournalTitleTxt = new javax.swing.JTextField();
        addJournalTitleLabel = new javax.swing.JLabel();
        addJournalNameLabel = new javax.swing.JLabel();
        addJournalNameTxt = new javax.swing.JTextField();
        AddResearchPanel = new javax.swing.JPanel();
        addResearchTitleLabel = new javax.swing.JLabel();
        addResearchTitleTxt = new javax.swing.JTextField();
        addResearchPubYearLabel = new javax.swing.JLabel();
        addResearchPubYearTxt = new javax.swing.JTextField();
        AddResearchAuthorInstructionLabel = new javax.swing.JLabel();
        AddResearchAuthorLabel = new javax.swing.JLabel();
        addResearchAuthorListTxt = new javax.swing.JTextField();
        addResearchBtn = new javax.swing.JButton();
        AddMagazinePanel = new javax.swing.JPanel();
        addMagazineTitleLabel = new javax.swing.JLabel();
        addMagazineTitleTxt = new javax.swing.JTextField();
        addMagazinePubYearLabel = new javax.swing.JLabel();
        addMagazinePubYearTxt = new javax.swing.JTextField();
        addMagazineBtn = new javax.swing.JButton();
        RemoveItemInnerPanel1 = new javax.swing.JPanel();
        RemoveItemTabbedPane = new javax.swing.JTabbedPane();
        removeBookPanel = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        removeBookList = new javax.swing.JList<>();
        removeBookBtn = new javax.swing.JButton();
        removeThesisPanel = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        removeThesisList = new javax.swing.JList<>();
        removeThesisBtn = new javax.swing.JButton();
        removeDissertationPanel = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        removeDissertationList = new javax.swing.JList<>();
        removeDissertationBtn = new javax.swing.JButton();
        removeConferencePanel = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        removeConferenceList = new javax.swing.JList<>();
        removeConferenceBtn = new javax.swing.JButton();
        removeJournalPanel = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        removeJournalList = new javax.swing.JList<>();
        removeJournalBtn = new javax.swing.JButton();
        removeResearchPanel = new javax.swing.JPanel();
        SearchResearchPalettePanel1 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        removeResearchList = new javax.swing.JList<>();
        removeResearchBtn = new javax.swing.JButton();
        removeMagazinePanel = new javax.swing.JPanel();
        SearchMagazinePalettePanel1 = new javax.swing.JPanel();
        MagazineSearchList1 = new javax.swing.JScrollPane();
        removeMagazineList = new javax.swing.JList<>();
        removeMagazineBtn = new javax.swing.JButton();
        RemoveItemTabbedPane1 = new javax.swing.JTabbedPane();
        AddRemoveInstructionLabel = new javax.swing.JLabel();
        GenerateReportPane = new javax.swing.JPanel();
        GenReportButton = new javax.swing.JButton();
        GeneratedReportScrollPane = new javax.swing.JScrollPane();
        GenReportTree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        RootPanel.setBackground(new java.awt.Color(32, 58, 78));

        MultiPaneLMS.setBackground(new java.awt.Color(203, 211, 217));
        MultiPaneLMS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(32, 58, 78), 1, true));
        MultiPaneLMS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N

        SearchPane.setBackground(new java.awt.Color(60, 91, 118));
        SearchPane.setForeground(new java.awt.Color(250, 250, 250));
        SearchPane.setName(""); // NOI18N
        SearchPane.setPreferredSize(new java.awt.Dimension(983, 650));

        SearchTabbedPanel.setBackground(new java.awt.Color(203, 211, 217));
        SearchTabbedPanel.setForeground(new java.awt.Color(3, 25, 38));
        SearchTabbedPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        SearchTabbedPanel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N

        
        jScrollPane10.setViewportView(SearchBookList);

        SearchBookTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookTitleLabel.setText("Title:");

        searchBookTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookTitleTxtActionPerformed(evt);
        //     }
        // });

        SearchBookEdNumLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookEdNumLabel.setText("Edition Number:");

        searchBookEdNumTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookEdNumTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookEdNumTxtActionPerformed(evt);
        //     }
        // });

        SearchBookPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookPubYearLabel.setText("Publication Year:");

        searchBookPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookPubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchBookChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookChapLabel.setText("Chapters:");

        searchBookChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookChapTxtActionPerformed(evt);
        //     }
        // });

        SearchBookFigsLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookFigsLabel.setText("Figures:");

        searchBookFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookFigsTxtActionPerformed(evt);
        //     }
        // });

        SearchBookPubLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookPubLabel.setText("Publisher:");

        searchBookPubTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchBookPubTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchBookPubTxtActionPerformed(evt);
        //     }
        // });

        SearchBookAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchBookAuthorLabel.setText("Authors:");

        searchBookBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchBookBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchBookBtn.setText("Search");
        searchBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookBtnActionPerformed(evt);
            }
        });

        confirmEditBookBtn.setVisible(false);
        confirmEditBookBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditBookBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditBookBtn.setText("Edit Book");
        confirmEditBookBtn.setActionCommand("EditBook");
        confirmEditBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditBookBtnActionPerformed(evt);
            }
        });

        searchBookAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        javax.swing.GroupLayout SearchBookPanelLayout = new javax.swing.GroupLayout(SearchBookPanel);
        SearchBookPanel.setLayout(SearchBookPanelLayout);
        SearchBookPanelLayout.setHorizontalGroup(
            SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBookPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane10)
                .addGap(20, 20, 20))
            .addGroup(SearchBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addComponent(SearchBookEdNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBookEdNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBookChapLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBookChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBookFigsLabel))
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addComponent(SearchBookTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addComponent(SearchBookPubYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBookPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBookAuthorLabel))
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addComponent(searchBookFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBookPubLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBookPubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBookBtn)
                    .addComponent(confirmEditBookBtn))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        SearchBookPanelLayout.setVerticalGroup(
            SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchBookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchBookPubYearLabel)
                                .addComponent(searchBookPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchBookAuthorLabel))
                            .addGroup(SearchBookPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchBookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBookEdNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBookEdNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBookChapLabel)
                            .addComponent(searchBookChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBookFigsLabel)
                            .addComponent(searchBookFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBookPubLabel)
                            .addComponent(searchBookPubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SearchBookPanelLayout.createSequentialGroup()
                        .addComponent(searchBookBtn)
                        .addGap(18, 18, 18)
                        .addComponent(confirmEditBookBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        SearchBookEdNumLabel.getAccessibleContext().setAccessibleName("EdNum");

        SearchTabbedPanel.addTab("Book", SearchBookPanel);

        //THESIS -----------------------------------

        SearchThesisList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchThesisListValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(SearchThesisList);

        searchThesisDepTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisDepTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisDepTxtActionPerformed(evt);
        //     }
        // });

        SearchThesisDepLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisDepLabel.setText("Department:");

        SearchThesisTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisTitleLabel.setText("Title:");

        searchThesisTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchThesisPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisPubYearLabel.setText("Publication Year:");

        searchThesisPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisPubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchThesisChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisChapLabel.setText("Chapters:");

        searchThesisChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisChapTxtActionPerformed(evt);
        //     }
        // });

        SearchThesisFigsLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisFigsLabel.setText("Figures:");

        searchThesisFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisFigsTxtActionPerformed(evt);
        //     }
        // });

        SearchThesisAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisAuthorLabel.setText("Author:");

        searchThesisAuthorTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisAuthorTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisAuthorTxtActionPerformed(evt);
        //     }
        // });

        SearchThesisCommitteeMemLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisCommitteeMemLabel.setText("Commitee Members:");

        searchThesisBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchThesisBtn.setText("Search");
        searchThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchThesisBtnActionPerformed(evt);
            }
        });

        confirmEditThesisBtn.setVisible(false);
        confirmEditThesisBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditThesisBtn.setActionCommand("EditThesis");
        // confirmEditThesisBtn.setLabel("Edit Thesis");
        confirmEditThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditThesisBtnActionPerformed(evt);
            }
        });

        SearchThesisBuildLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchThesisBuildLabel.setText("Building:");

        searchThesisBuildTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchThesisBuildTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchThesisBuildTxtActionPerformed(evt);
        //     }
        // });

        javax.swing.GroupLayout SearchThesisPanelLayout = new javax.swing.GroupLayout(SearchThesisPanel);
        SearchThesisPanel.setLayout(SearchThesisPanelLayout);
        SearchThesisPanelLayout.setHorizontalGroup(
            SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane9)
                .addGap(20, 20, 20))
            .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                        .addComponent(SearchThesisTitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(searchThesisTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchThesisPubYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchThesisPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchThesisFigsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchThesisFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchThesisCommitteeMemLabel))
                    .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                        .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchThesisPanelLayout.createSequentialGroup()
                                .addComponent(SearchThesisBuildLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchThesisBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchThesisPanelLayout.createSequentialGroup()
                                .addComponent(SearchThesisDepLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchThesisDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(SearchThesisChapLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchThesisCommitteeMemLabel)
                                .addComponent(searchThesisCommitteeMemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmEditThesisBtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchThesisPanelLayout.createSequentialGroup()
                        .addComponent(searchThesisBtn)
                        .addGap(10, 10, 10)))
                .addGap(29, 29, 29))))
        );

        SearchThesisPanelLayout.setVerticalGroup(
            SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchThesisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                        .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchThesisTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchThesisPubYearLabel)
                                .addComponent(searchThesisPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchThesisFigsLabel)
                                .addComponent(searchThesisFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchThesisCommitteeMemLabel))
                            .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchThesisTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SearchThesisChapLabel)
                                    .addComponent(searchThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchThesisAuthorLabel)
                                    .addComponent(searchThesisAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchThesisPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SearchThesisDepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchThesisDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(SearchThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchThesisBuildLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchThesisBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SearchThesisPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(searchThesisBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmEditThesisBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        SearchTabbedPanel.addTab("Thesis", SearchThesisPanel);


//DISSERTATION ----------------------------
        SearchDissertationList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchDissertationListValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(SearchDissertationList);

        searchDisseratationTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchDissertationTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationTitleLabel.setText("Title:");

        SearchDissertationDepLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationDepLabel.setText("Department:");

        searchDissertationDepTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationDepTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationDepTxtActionPerformed(evt);
        //     }
        // });

        searchDissertationPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationPubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchDissertationPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationPubYearLabel.setText("Publication Year:");

        SearchDissertationChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationChapLabel.setText("Chapters:");

        searchDissertationChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationChapTxtActionPerformed(evt);
        //     }
        // });

        SearchDissertationCommitteeMemLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationCommitteeMemLabel.setText("Commitee Members:");

        searchDissertationCommitteeMemTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        searchDissertationBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchDissertationBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchDissertationBtn.setText("Search");
        searchDissertationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDissertationBtnActionPerformed(evt);
            }
        });

        searchDissertationFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationFigsTxtActionPerformed(evt);
        //     }
        // });

        SearchDissertationFigsLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationFigsLabel.setText("Figures:");

        SearchDissertationAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchDissertationAuthorLabel.setText("Author:");

        searchDissertationAuthorTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationAuthorTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationAuthorTxtActionPerformed(evt);
        //     }
        // });

        confirmEditDissertationBtn.setVisible(false);
        confirmEditDissertationBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditDissertationBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditDissertationBtn.setText("Edit Dissertation");
        confirmEditDissertationBtn.setActionCommand("EditBook");
        confirmEditDissertationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditDissertationBtnActionPerformed(evt);
            }
        });

        searchDissertationBuildingLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        searchDissertationBuildingLabel.setText("Building:");

        searchDissertationBuildTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchDissertationBuildTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchDissertationBuildTxtActionPerformed(evt);
        //     }
        // });

        javax.swing.GroupLayout SearchDissertationPanelLayout = new javax.swing.GroupLayout(SearchDissertationPanel);
        SearchDissertationPanel.setLayout(SearchDissertationPanelLayout);
        SearchDissertationPanelLayout.setHorizontalGroup(
            SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                        .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                                .addComponent(SearchDissertationTitleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(searchDisseratationTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchDissertationPubYearLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchDissertationPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchDissertationFigsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchDissertationFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchDissertationCommitteeMemLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchDissertationCommitteeMemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                                .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchDissertationDepLabel)
                                    .addComponent(searchDissertationBuildingLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchDissertationDepTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(searchDissertationBuildTxt))
                                .addGap(57, 57, 57)
                                .addComponent(SearchDissertationChapLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchDissertationChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchDissertationAuthorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchDissertationAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDissertationPanelLayout.createSequentialGroup()
                                        .addComponent(searchDissertationBtn)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDissertationPanelLayout.createSequentialGroup()
                                        .addComponent(confirmEditDissertationBtn)
                                        .addContainerGap())))
                    .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addGap(20, 20, 20))))
        );
        SearchDissertationPanelLayout.setVerticalGroup(
            SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDissertationPanelLayout.createSequentialGroup()
                
                .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchDisseratationTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchDissertationPubYearLabel)
                                .addComponent(searchDissertationPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchDissertationFigsLabel)
                                .addComponent(searchDissertationFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchDissertationCommitteeMemLabel)
                                .addComponent(searchDissertationCommitteeMemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchDissertationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchDissertationDepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchDissertationDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchDissertationChapLabel)
                            .addComponent(searchDissertationChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchDissertationAuthorLabel)
                            .addComponent(searchDissertationAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(SearchDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchDissertationBuildingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchDissertationBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SearchDissertationPanelLayout.createSequentialGroup()
                        .addComponent(searchDissertationBtn)
                        .addGap(18, 18, 18)
                        .addComponent(confirmEditDissertationBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SearchTabbedPanel.addTab("Dissertation", SearchDissertationPanel);

        SearchConferenceList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchConferenceListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(SearchConferenceList);

        SearchConferenceAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchConferenceAuthorLabel.setText("Authors:");

        searchConferenceAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        searchConferenceBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchConferenceBtn.setText("Search");
        searchConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchConferenceBtnActionPerformed(evt);
            }
        });

        SearchConferenceNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchConferenceNameLabel.setText("Conference Name: ");

        searchConferencePubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchConferencePubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchConferencePubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchConferenceTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchConferenceTitleLabel.setText("Title:");

        searchConferenceTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchConferencePublicationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchConferencePublicationLabel.setText("Publication Year:");

        searchConferenceNameTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchConferenceNameTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchConferenceNameTxtActionPerformed(evt);
        //     }
        // });

        searchConferenceEndDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        searchConferenceEndDateLabel.setText("End Date:");

        searchConferenceBeginDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        searchConferenceBeginDateLabel.setText("Start Date:");

        searchConferenceBeginDateFrmtTxt.setText("dd/mm/yyyy");
        searchConferenceBeginDateFrmtTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        searchConferenceEndDateFrmtTxt.setText("dd/mm/yyyy");
        searchConferenceEndDateFrmtTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        confirmEditConferenceBtn.setVisible(false);
        confirmEditConferenceBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditConferenceBtn.setText("Edit Conference");
        confirmEditConferenceBtn.setActionCommand("EditBook");
        confirmEditConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditConferenceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchConferencePanelLayout = new javax.swing.GroupLayout(SearchConferencePanel);
        SearchConferencePanel.setLayout(SearchConferencePanelLayout);
        SearchConferencePanelLayout.setHorizontalGroup(
            SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                        .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                                .addComponent(SearchConferenceTitleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(searchConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(SearchConferencePublicationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(SearchConferenceAuthorLabel))
                            .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                                .addComponent(SearchConferenceNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchConferenceBeginDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchConferenceBeginDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchConferenceEndDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchConferenceEndDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchConferencePanelLayout.createSequentialGroup()
                                .addComponent(searchConferenceBtn)
                                .addComponent(searchConferenceAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addComponent(confirmEditConferenceBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane7))
                .addGap(20, 20, 20))
        );
        SearchConferencePanelLayout.setVerticalGroup(
            SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchConferencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                        .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchConferencePublicationLabel)
                                .addComponent(searchConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchConferenceAuthorLabel))
                                .addComponent(searchConferenceAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchConferenceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(SearchConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchConferenceNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchConferenceBeginDateLabel)
                            .addComponent(searchConferenceBeginDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchConferenceEndDateLabel)
                            .addComponent(searchConferenceEndDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SearchConferencePanelLayout.createSequentialGroup()
                        .addComponent(searchConferenceBtn)
                        .addGap(35, 35, 35)
                        .addComponent(confirmEditConferenceBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                
        );

        SearchConferenceNameLabel.getAccessibleContext().setAccessibleDescription("");

        SearchTabbedPanel.addTab("Conference Paper", SearchConferencePanel);

        SearchJournalList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchJournalListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(SearchJournalList);

        searchJournalBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchJournalBtn.setText("Search");
        searchJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJournalBtnActionPerformed(evt);
            }
        });

        searchJournalTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchJournalTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchJournalTitleLabel.setText("Title:");

        SearchJournalAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchJournalAuthorLabel.setText("Author:");

        searchJournalAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        SearchJournalNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchJournalNameLabel.setText("Journal Name: ");

        searchJournalNameTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchJournalNameTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchJournalNameTxtActionPerformed(evt);
        //     }
        // });

        searchJournalPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchJournalPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchJournalPubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchJournalPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchJournalPubYearLabel.setText("Publication Year:");

        confirmEditJournalBtn.setVisible(false);
        confirmEditJournalBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditJournalBtn.setText("Edit Journal");
        confirmEditJournalBtn.setActionCommand("EditBook");
        confirmEditJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditJournalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchJournalPanelLayout = new javax.swing.GroupLayout(SearchJournalPanel);
        SearchJournalPanel.setLayout(SearchJournalPanelLayout);
        SearchJournalPanelLayout.setHorizontalGroup(
            SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                        .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                                .addComponent(SearchJournalTitleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(searchJournalTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(SearchJournalPubYearLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(SearchJournalAuthorLabel))
                            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                                .addComponent(SearchJournalNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchJournalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                                .addGap(0, 270, Short.MAX_VALUE)
                                .addComponent(confirmEditJournalBtn)
                                .addGap(44, 44, 44))
                            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                                .addComponent(searchJournalAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchJournalBtn)
                                .addGap(59, 59, 59))))
                    .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );
        SearchJournalPanelLayout.setVerticalGroup(
            SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                        .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchJournalTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchJournalAuthorLabel)
                                .addComponent(SearchJournalPubYearLabel)
                                .addComponent(searchJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchJournalAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchJournalTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(SearchJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchJournalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchJournalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SearchJournalPanelLayout.createSequentialGroup()
                        .addComponent(searchJournalBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmEditJournalBtn)))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addContainerGap())
        );

        SearchTabbedPanel.addTab("Journal", SearchJournalPanel);

        SearchResearchTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchResearchTitleLabel.setText("Title:");

        searchResearchTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchResearchAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchResearchAuthorLabel.setText("Authors:");

        searchResearchAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        SearchResearchList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchResearchListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(SearchResearchList);

        searchResearchBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchResearchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchResearchBtn.setText("Search");
        searchResearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchResearchBtnActionPerformed(evt);
            }
        });

        searchResearchPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchResearchPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchResearchPubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchResearchPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchResearchPubYearLabel.setText("Publication Year:");

        confirmEditResearchBtn.setVisible(false);
        confirmEditResearchBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditResearchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditResearchBtn.setText("Edit Research Paper");
        confirmEditResearchBtn.setActionCommand("EditBook");
        confirmEditResearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditResearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchResearchPalettePanelLayout = new javax.swing.GroupLayout(SearchResearchPalettePanel);
        SearchResearchPalettePanel.setLayout(SearchResearchPalettePanelLayout);
        SearchResearchPalettePanelLayout.setHorizontalGroup(
            SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(SearchResearchTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(searchResearchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(SearchResearchPubYearLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchResearchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SearchResearchAuthorLabel)
                
                .addGroup(SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(confirmEditResearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchResearchAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(searchResearchBtn)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchResearchPalettePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        SearchResearchPalettePanelLayout.setVerticalGroup(
            SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                .addGroup(SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SearchResearchPalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchResearchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchResearchPubYearLabel)
                                .addComponent(searchResearchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchResearchAuthorLabel)
                                .addComponent(searchResearchAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(SearchResearchTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(SearchResearchPalettePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(searchResearchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmEditResearchBtn)))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchResearchBtn.getAccessibleContext().setAccessibleName("SearchResearch");

        javax.swing.GroupLayout SearchResearchPanelLayout = new javax.swing.GroupLayout(SearchResearchPanel);
        SearchResearchPanel.setLayout(SearchResearchPanelLayout);
        SearchResearchPanelLayout.setHorizontalGroup(
            SearchResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchResearchPalettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SearchResearchPanelLayout.setVerticalGroup(
            SearchResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchResearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchResearchPalettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SearchTabbedPanel.addTab("Research Paper", SearchResearchPanel);

        SearchMagazineTitleLablel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        SearchMagazineTitleLablel.setText("Title:");

        searchMagazineTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        SearchMagazineList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SearchMagazineListValueChanged(evt);
            }
        });
        MagazineSearchList.setViewportView(SearchMagazineList);

        searchMagazineBtn.setBackground(new java.awt.Color(203, 211, 217));
        searchMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        searchMagazineBtn.setText("Search");
        searchMagazineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMagazineBtnActionPerformed(evt);
            }
        });

        searchMagazinePubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // searchMagazinePubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         searchMagazinePubYearTxtActionPerformed(evt);
        //     }
        // });

        SearchMagazinePubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SearchMagazinePubYearLabel.setText("Publication Year:");

        confirmEditMagazineBtn.setVisible(false);
        confirmEditMagazineBtn.setBackground(new java.awt.Color(203, 211, 217));
        confirmEditMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        confirmEditMagazineBtn.setText("Edit Magazine");
        confirmEditMagazineBtn.setActionCommand("EditBook");
        confirmEditMagazineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditMagazineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchMagazinePalettePanelLayout = new javax.swing.GroupLayout(SearchMagazinePalettePanel);
        SearchMagazinePalettePanel.setLayout(SearchMagazinePalettePanelLayout);
        SearchMagazinePalettePanelLayout.setHorizontalGroup(
            SearchMagazinePalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMagazinePalettePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMagazinePalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchMagazinePalettePanelLayout.createSequentialGroup()
                        .addComponent(MagazineSearchList)
                        .addContainerGap())
                    .addGroup(SearchMagazinePalettePanelLayout.createSequentialGroup()
                        .addComponent(SearchMagazineTitleLablel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(SearchMagazinePubYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(searchMagazineBtn)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchMagazinePalettePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmEditMagazineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        SearchMagazinePalettePanelLayout.setVerticalGroup(
            SearchMagazinePalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMagazinePalettePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMagazinePalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchMagazineTitleLablel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SearchMagazinePalettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchMagazinePubYearLabel)
                        .addComponent(searchMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchMagazineBtn))
                    .addComponent(searchMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmEditMagazineBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MagazineSearchList, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        searchMagazineBtn.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout SearchMagazinePanelLayout = new javax.swing.GroupLayout(SearchMagazinePanel);
        SearchMagazinePanel.setLayout(SearchMagazinePanelLayout);
        SearchMagazinePanelLayout.setHorizontalGroup(
            SearchMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchMagazinePalettePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SearchMagazinePanelLayout.setVerticalGroup(
            SearchMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchMagazinePalettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SearchTabbedPanel.addTab("Magazine", SearchMagazinePanel);

        ItmSearchLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ItmSearchLabel.setForeground(new java.awt.Color(250, 250, 250));
        ItmSearchLabel.setText("Please select the type of item you are looking for.");

        ItmSearchDescLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ItmSearchDescLabel.setForeground(new java.awt.Color(250, 250, 250));
        ItmSearchDescLabel.setText("Item Search");
        ItmSearchDescLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout SearchPaneLayout = new javax.swing.GroupLayout(SearchPane);
        SearchPane.setLayout(SearchPaneLayout);
        SearchPaneLayout.setHorizontalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItmSearchDescLabel)
                    .addComponent(ItmSearchLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SearchTabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        SearchPaneLayout.setVerticalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(ItmSearchDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ItmSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MultiPaneLMS.addTab("Search", SearchPane);

        AddRemovePane.setBackground(new java.awt.Color(60, 91, 118));

        EditItemPanel.setBackground(new java.awt.Color(155, 171, 184));
        EditItemPanel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        AddItemPanel.setBackground(new java.awt.Color(155, 171, 184));

        AddItemTabbedPane.setBackground(new java.awt.Color(203, 211, 217));
        AddItemTabbedPane.setForeground(new java.awt.Color(3, 25, 38));
        AddItemTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        AddItemTabbedPane.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N

        AddBookTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookTitleLabel.setText("Title:");

        addBookTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookTitleTxtActionPerformed(evt);
        //     }
        // });

        AddBookEdNumLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookEdNumLabel.setText("Edition Number:");

        addBookEdNumTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookEdNumTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookEdNumTxtActionPerformed(evt);
        //     }
        // });

        AddBookPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookPubYearLabel.setText("Publication Year:");

        addBookPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookPubYearTxtActionPerformed(evt);
        //     }
        // });

        AddBookChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookChapLabel.setText("Chapters:");

        addBookChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookChapTxtActionPerformed(evt);
        //     }
        // });

        AddBookFigLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookFigLabel.setText("Number of Figures:");
        AddBookFigLabel.setToolTipText("");

        addBookFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookFigsTxtActionPerformed(evt);
        //     }
        // });

        AddBookPubLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookPubLabel.setText("Publisher:");

        addBookPubTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addBookPubTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBookPubTxtActionPerformed(evt);
        //     }
        // });

        AddBookAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddBookAuthorLabel.setText("Authors:");

        AddBookAuthorInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddBookAuthorInstructionLabel.setText("Enter the author(s) of the book. If there are multiple, seprate them by a semicolon. (;)");

        addBookBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addBookBtn.setText("Add Book");
        addBookBtn.setActionCommand("AddBook");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddBookPanelLayout = new javax.swing.GroupLayout(AddBookPanel);
        AddBookPanel.setLayout(AddBookPanelLayout);
        AddBookPanelLayout.setHorizontalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addComponent(AddBookPubYearLabel)
                        .addGap(25, 25, 25)
                        .addComponent(addBookPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddBookPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddBookEdNumLabel)
                                    .addComponent(AddBookChapLabel)))
                            .addComponent(AddBookTitleLabel))
                        .addGap(25, 25, 25)
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBookPanelLayout.createSequentialGroup()
                                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addBookEdNumTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(addBookChapTxt))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AddBookPanelLayout.createSequentialGroup()
                                .addComponent(addBookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddBookPanelLayout.createSequentialGroup()
                                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddBookFigLabel)
                                    .addComponent(AddBookPubLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBookFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addBookPubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddBookPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddBookAuthorInstructionLabel)
                                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                                        .addComponent(AddBookAuthorLabel)
                                        .addGap(63, 63, 63)
                                        .addComponent(addBookAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(217, Short.MAX_VALUE))))
        );
        AddBookPanelLayout.setVerticalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBookPubYearLabel))
                .addGap(12, 12, 12)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addComponent(addBookEdNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBookChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addComponent(AddBookEdNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddBookChapLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBookFigLabel)
                    .addComponent(addBookFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBookPubLabel)
                    .addComponent(addBookPubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(AddBookAuthorInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddBookAuthorLabel)
                    .addComponent(addBookAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        addBookBtn.getAccessibleContext().setAccessibleName("Add Item");

        AddItemTabbedPane.addTab("Book", AddBookPanel);

        addThesisTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addThesisTitleLabel.setText("Title:");

        addThesisTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisTitleTxtActionPerformed(evt);
        //     }
        // });

        AddThesisPubYear.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisPubYear.setText("Publication Year:");

        addThesisPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisPubYearTxtActionPerformed(evt);
        //     }
        // });

        AddThesisDepLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisDepLabel.setText("Department:");

        addThesisDepTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisDepTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisDepTxtActionPerformed(evt);
        //     }
        // });

        AddThesisChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisChapLabel.setText("Chapters:");

        addThesisChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisChapTxtActionPerformed(evt);
        //     }
        // });

        AddThesisFigLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisFigLabel.setText("Number of Figures:");
        AddThesisFigLabel.setToolTipText("");

        addThesisFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisFigsTxtActionPerformed(evt);
        //     }
        // });

        AddThesisAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisAuthorLabel.setText("Author:");

        addThesisAuthorTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisAuthorTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisAuthorTxtActionPerformed(evt);
        //     }
        // });

        AddThesisCommitteeMemInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddThesisCommitteeMemInstructionLabel.setText("Enter the committee members, and committee name, and seprate them by a semicolon. (;)");

        AddThesisCommitteeMemLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisCommitteeMemLabel.setText("Commitee Members:");

        addThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addThesisBtn.setText("Add Thesis");
        addThesisBtn.setActionCommand("AddBook");
        addThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addThesisBtnActionPerformed(evt);
            }
        });

        AddThesisBuildLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddThesisBuildLabel.setText("Building:");

        addThesisBuildTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addThesisBuildTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addThesisBuildTxtActionPerformed(evt);
        //     }
        // });

        javax.swing.GroupLayout AddThesisPanelLayout = new javax.swing.GroupLayout(AddThesisPanel);
        AddThesisPanel.setLayout(AddThesisPanelLayout);
        AddThesisPanelLayout.setHorizontalGroup(
            AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddThesisPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddThesisPanelLayout.createSequentialGroup()
                        .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddThesisDepLabel)
                            .addComponent(AddThesisChapLabel)
                            .addComponent(AddThesisPubYear)
                            .addComponent(addThesisTitleLabel))
                        .addGap(25, 25, 25)
                        .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addThesisTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addThesisPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddThesisPanelLayout.createSequentialGroup()
                                .addComponent(addThesisDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddThesisBuildLabel)
                                .addGap(31, 31, 31)
                                .addComponent(addThesisBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(483, Short.MAX_VALUE))
                    .addGroup(AddThesisPanelLayout.createSequentialGroup()
                        .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddThesisFigLabel)
                            .addComponent(AddThesisAuthorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addThesisFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addThesisAuthorTxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddThesisPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddThesisCommitteeMemInstructionLabel)
                            .addGroup(AddThesisPanelLayout.createSequentialGroup()
                                .addComponent(AddThesisCommitteeMemLabel)
                                .addGap(33, 33, 33)
                                .addComponent(addThesisCommitteeMemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(addThesisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        AddThesisPanelLayout.setVerticalGroup(
            AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddThesisPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addThesisTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addThesisTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddThesisPubYear)
                    .addComponent(addThesisPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddThesisDepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addThesisDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddThesisBuildLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addThesisBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddThesisChapLabel)
                    .addComponent(addThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddThesisFigLabel)
                    .addComponent(addThesisFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddThesisAuthorLabel)
                    .addComponent(addThesisAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddThesisCommitteeMemInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddThesisCommitteeMemLabel)
                    .addGroup(AddThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addThesisCommitteeMemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addThesisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        AddItemTabbedPane.addTab("Thesis", AddThesisPanel);

        addDissertationTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addDissertationTitleLabel.setText("Title:");

        addDissertationTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationTitleTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationPubYearLabel.setText("Publication Year:");

        addDissertationPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationPubYearTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationDepLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationDepLabel.setText("Department:");

        addDissertationDepTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationDepTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationDepTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationChapLabel.setText("Chapters:");

        addDissertationChapTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationChapTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationChapTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationFigsLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationFigsLabel.setText("Number of Figures:");
        AddDissertationFigsLabel.setToolTipText("");

        addDissertationFigsTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationFigsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationFigsTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationAuthorLabel.setText("Author:");

        addDissertationAuthorTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationAuthorTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationAuthorTxtActionPerformed(evt);
        //     }
        // });

        AddDissertationCommitteeMemInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddDissertationCommitteeMemInstructionLabel.setText("Enter the committee members, and committe name, and seprate them by a semicolon. (;)");

        AddDissertationCommitteeMemLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationCommitteeMemLabel.setText("Commitee Members:");

        // addDissertationCommitteeMemsTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationCommiteeMemsTxtActionPerformed(evt);
        //     }
        // });

        addDissertationBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addDissertationBtn.setText("Add Dissertation");
        addDissertationBtn.setActionCommand("AddBook");
        addDissertationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDissertationBtnActionPerformed(evt);
            }
        });

        AddDissertationBuildLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddDissertationBuildLabel.setText("Building:");

        addDissertationBuildTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addDissertationBuildTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationBuildTxtActionPerformed(evt);
        //     }
        // });

        javax.swing.GroupLayout AddDissertationPanelLayout = new javax.swing.GroupLayout(AddDissertationPanel);
        AddDissertationPanel.setLayout(AddDissertationPanelLayout);
        AddDissertationPanelLayout.setHorizontalGroup(
            AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                            .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddDissertationFigsLabel)
                                .addComponent(AddDissertationAuthorLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addDissertationFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addDissertationAuthorTxt)))
                        .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                            .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddDissertationDepLabel)
                                .addComponent(AddDissertationChapLabel)
                                .addComponent(AddDissertationPubYearLabel)
                                .addComponent(addDissertationTitleLabel))
                            .addGap(25, 25, 25)
                            .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addDissertationTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addDissertationPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addDissertationChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                                    .addComponent(addDissertationDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AddDissertationBuildLabel)
                                    .addGap(29, 29, 29)
                                    .addComponent(addDissertationBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddDissertationCommitteeMemInstructionLabel)
                            .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                                .addComponent(AddDissertationCommitteeMemLabel)
                                .addGap(33, 33, 33)
                                .addComponent(addDissertationCommitteeMemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addDissertationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        AddDissertationPanelLayout.setVerticalGroup(
            AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDissertationPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDissertationTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDissertationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDissertationPubYearLabel)
                    .addComponent(addDissertationPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDissertationDepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDissertationDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddDissertationBuildLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDissertationBuildTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDissertationChapLabel)
                    .addComponent(addDissertationChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDissertationFigsLabel)
                    .addComponent(addDissertationFigsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDissertationAuthorLabel)
                    .addComponent(addDissertationAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddDissertationCommitteeMemInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddDissertationCommitteeMemLabel)
                    .addGroup(AddDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addDissertationCommitteeMemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addDissertationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        AddItemTabbedPane.addTab("Dissertation", AddDissertationPanel);

        addConferenceTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        // addConferenceTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationTitleTxt1ActionPerformed(evt);
        //     }
        // });

        addConferenceTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addConferenceTitleLabel.setText("Title:");

        AddConferencePubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddConferencePubYearLabel.setText("Publication Year:");

        addConferencePubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N

        // addConferencePubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addDissertationPubYearTxt1ActionPerformed(evt);
        //     }
        // });

        addConferenceNameTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addConferenceNameTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addConferenceNameTxtActionPerformed(evt);
        //     }
        // });

        AddConferenceNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddConferenceNameLabel.setText("Conference Name:");

        addConferenceStartDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addConferenceStartDateLabel.setText("Start Date:");
        addConferenceStartDateLabel.setToolTipText("");

        addConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addConferenceBtn.setText("Add Conference Paper");
        addConferenceBtn.setActionCommand("AddBook");
        addConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConferenceBtnActionPerformed(evt);
            }
        });

        addConferenceLocationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addConferenceLocationLabel.setText("Location:");

        addConferenceLocationTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addConferenceLocationTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addConferenceLocationTxtActionPerformed(evt);
        //     }
        // });

        AddConferenceAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddConferenceAuthorLabel.setText("Authors:");

        AddConferenceAuthorInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddConferenceAuthorInstructionLabel.setText("Enter the author(s) of the conference paper. If there are multiple, seprate them by a semicolon. (;)");

        addConferenceBeginDateFrmtTxt.setText("dd/mm/yyyy");

        addConferenceEndDateFrmtTxt.setText("dd/mm/yyyy");

        addConferenceEndDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addConferenceEndDateLabel.setText("End Date:");
        addConferenceEndDateLabel.setToolTipText("");

        javax.swing.GroupLayout AddConferencePanelLayout = new javax.swing.GroupLayout(AddConferencePanel);

        AddConferencePanel.setLayout(AddConferencePanelLayout);
        AddConferencePanelLayout.setHorizontalGroup(
            AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddConferencePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddConferencePanelLayout.createSequentialGroup()
                        .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddConferenceAuthorInstructionLabel)
                            .addGroup(AddConferencePanelLayout.createSequentialGroup()
                                .addComponent(AddConferenceAuthorLabel)
                                .addGap(105, 105, 105)
                                .addComponent(addConferenceAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 368, Short.MAX_VALUE))
                    .addGroup(AddConferencePanelLayout.createSequentialGroup()
                        .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddConferencePanelLayout.createSequentialGroup()
                                .addComponent(AddConferenceNameLabel)
                                .addGap(52, 52, 52)
                                .addComponent(addConferenceLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddConferencePanelLayout.createSequentialGroup()
                                .addComponent(addConferenceStartDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addConferenceBeginDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(addConferenceEndDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addConferenceEndDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddConferencePanelLayout.createSequentialGroup()
                                    .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AddConferencePubYearLabel)
                                        .addComponent(addConferenceTitleLabel)
                                        .addComponent(addConferenceLocationLabel))
                                    .addGap(61, 61, 61)
                                    .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addConferenceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        AddConferencePanelLayout.setVerticalGroup(
            AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddConferencePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addConferenceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddConferencePubYearLabel)
                    .addComponent(addConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddConferenceNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddConferencePanelLayout.createSequentialGroup()
                        .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addConferenceEndDateLabel)
                                .addComponent(addConferenceEndDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addConferenceStartDateLabel)
                                .addComponent(addConferenceBeginDateFrmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addConferenceLocationLabel)
                            .addComponent(addConferenceLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddConferencePanelLayout.createSequentialGroup()
                        .addComponent(addConferenceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(AddConferenceAuthorInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddConferenceAuthorLabel)
                    .addComponent(addConferenceAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        AddItemTabbedPane.addTab("Conference Paper", AddConferencePanel);

        AddJournalAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddJournalAuthorLabel.setText("Authors:");

        AddJournalAuthorInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddJournalAuthorInstructionLabel.setText("Enter the author(s) of the journal. If there are multiple, seprate them by a semicolon. (;)");

        addJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addJournalBtn.setText("Add Journal");
        addJournalBtn.setActionCommand("AddBook");
        addJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJournalBtnActionPerformed(evt);
            }
        });

        addJournalPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addJournalPubYearLabel.setText("Publication Year:");

        addJournalPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addJournalPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addJournalPubYearTxtActionPerformed(evt);
        //     }
        // });

        addJournalTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addJournalTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addJournalTitleTxtActionPerformed(evt);
        //     }
        // });

        addJournalTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addJournalTitleLabel.setText("Title:");

        addJournalNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addJournalNameLabel.setText("Journal Name:");

        addJournalNameTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addJournalNameTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addJournalNameTxtActionPerformed(evt);
        //     }
        // });

        javax.swing.GroupLayout AddJournalPanelLayout = new javax.swing.GroupLayout(AddJournalPanel);

        AddJournalPanel.setLayout(AddJournalPanelLayout);
        AddJournalPanelLayout.setHorizontalGroup(
            AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddJournalPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddJournalAuthorInstructionLabel)
                    .addGroup(AddJournalPanelLayout.createSequentialGroup()
                        .addComponent(AddJournalAuthorLabel)
                        .addGap(105, 105, 105)
                        .addComponent(addJournalAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(addJournalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(AddJournalPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addJournalNameLabel)
                    .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addJournalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddJournalPanelLayout.createSequentialGroup()
                            .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addJournalPubYearLabel)
                                .addComponent(addJournalTitleLabel))
                            .addGap(61, 61, 61)
                            .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addJournalTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddJournalPanelLayout.setVerticalGroup(
            AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddJournalPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJournalTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJournalTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJournalPubYearLabel)
                    .addComponent(addJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJournalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJournalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddJournalAuthorInstructionLabel)
                .addGap(18, 18, 18)
                .addGroup(AddJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addJournalAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddJournalAuthorLabel)
                    .addComponent(addJournalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        AddItemTabbedPane.addTab("Journal", AddJournalPanel);

        addResearchTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addResearchTitleLabel.setText("Title:");

        addResearchTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addResearchTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addResearchTitleTxtActionPerformed(evt);
        //     }
        // });

        addResearchPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addResearchPubYearLabel.setText("Publication Year:");

        addResearchPubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addResearchPubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addResearchPubYearTxtActionPerformed(evt);
        //     }
        // });

        AddResearchAuthorInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AddResearchAuthorInstructionLabel.setText("Enter the author(s) of the journal. If there are multiple, seprate them by a semicolon. (;)");

        AddResearchAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddResearchAuthorLabel.setText("Authors:");

        addResearchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addResearchBtn.setText("Add Research paper");
        addResearchBtn.setActionCommand("AddBook");
        addResearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddResearchPanelLayout = new javax.swing.GroupLayout(AddResearchPanel);

        AddResearchPanel.setLayout(AddResearchPanelLayout);
        AddResearchPanelLayout.setHorizontalGroup(
            AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddResearchPanelLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddResearchPanelLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addResearchPubYearLabel)
                                .addComponent(addResearchTitleLabel))
                            .addGap(61, 61, 61)
                            .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addResearchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addResearchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddResearchPanelLayout.createSequentialGroup()
                                .addComponent(AddResearchAuthorInstructionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddResearchPanelLayout.createSequentialGroup()
                                .addComponent(AddResearchAuthorLabel)
                                .addGap(105, 105, 105)
                                .addComponent(addResearchAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addResearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(173, Short.MAX_VALUE)))
        );
        AddResearchPanelLayout.setVerticalGroup(
            AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
            .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddResearchPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addResearchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addResearchTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addResearchPubYearLabel)
                        .addComponent(addResearchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(70, 70, 70)
                    .addComponent(AddResearchAuthorInstructionLabel)
                    .addGap(18, 18, 18)
                    .addGroup(AddResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addResearchAuthorListTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddResearchAuthorLabel)
                        .addComponent(addResearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(65, 65, 65)))
        );

        AddItemTabbedPane.addTab("Research Paper", AddResearchPanel);

        addMagazineTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addMagazineTitleLabel.setText("Title:");

        addMagazineTitleTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addMagazineTitleTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addMagazineTitleTxtActionPerformed(evt);
        //     }
        // });

        addMagazinePubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addMagazinePubYearLabel.setText("Publication Year:");

        addMagazinePubYearTxt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        // addMagazinePubYearTxt.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addMagazinePubYearTxtActionPerformed(evt);
        //     }
        // });

        addMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addMagazineBtn.setText("Add Magazine");
        addMagazineBtn.setActionCommand("AddBook");
        addMagazineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMagazineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddMagazinePanelLayout = new javax.swing.GroupLayout(AddMagazinePanel);
        AddMagazinePanel.setLayout(AddMagazinePanelLayout);
        AddMagazinePanelLayout.setHorizontalGroup(
            AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMagazinePanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMagazinePubYearLabel)
                    .addComponent(addMagazineTitleLabel))
                .addGap(61, 61, 61)
                .addGroup(AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(addMagazineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        AddMagazinePanelLayout.setVerticalGroup(
            AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMagazinePanelLayout.createSequentialGroup()
                .addGroup(AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMagazinePanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMagazineTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(AddMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addMagazinePubYearLabel)
                            .addComponent(addMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddMagazinePanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(addMagazineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        AddItemTabbedPane.addTab("Magazine", AddMagazinePanel);

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(AddItemTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddItemTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        EditItemPanel.addTab("Add Item", AddItemPanel);

        RemoveItemInnerPanel1.setBackground(new java.awt.Color(155, 171, 184));

        RemoveItemTabbedPane.setBackground(new java.awt.Color(203, 211, 217));
        RemoveItemTabbedPane.setForeground(new java.awt.Color(3, 25, 38));
        RemoveItemTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        RemoveItemTabbedPane.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N

        jScrollPane16.setViewportView(removeBookList);

        removeBookBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeBookBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeBookBtn.setText("Remove Book");
        removeBookBtn.setActionCommand("RemoveBook");
        removeBookBtn.setOpaque(true);
        removeBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeBookPanelLayout = new javax.swing.GroupLayout(removeBookPanel);
        removeBookPanel.setLayout(removeBookPanelLayout);
        removeBookPanelLayout.setHorizontalGroup(
            removeBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBookPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(removeBookBtn)
                .addGap(21, 21, 21))
        );
        removeBookPanelLayout.setVerticalGroup(
            removeBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBookPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(removeBookBtn)
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBookPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        RemoveItemTabbedPane.addTab("Book", removeBookPanel);

        jScrollPane18.setViewportView(removeThesisList);

        removeThesisBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeThesisBtn.setText("Remove Thesis");
        removeThesisBtn.setActionCommand("RemoveBook");
        removeThesisBtn.setOpaque(true);
        removeThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeThesisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeThesisPanelLayout = new javax.swing.GroupLayout(removeThesisPanel);
        removeThesisPanel.setLayout(removeThesisPanelLayout);
        removeThesisPanelLayout.setHorizontalGroup(
            removeThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeThesisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeThesisBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        removeThesisPanelLayout.setVerticalGroup(
            removeThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeThesisPanelLayout.createSequentialGroup()
                .addGroup(removeThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeThesisPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removeThesisPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(removeThesisBtn)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        RemoveItemTabbedPane.addTab("Thesis", removeThesisPanel);

        jScrollPane20.setViewportView(removeDissertationList);

        removeDissertationBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeDissertationBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeDissertationBtn.setText("Remove Dissertation");
        removeDissertationBtn.setActionCommand("RemoveBook");
        removeDissertationBtn.setOpaque(true);
        removeDissertationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDissertationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeDissertationPanelLayout = new javax.swing.GroupLayout(removeDissertationPanel);
        removeDissertationPanel.setLayout(removeDissertationPanelLayout);
        removeDissertationPanelLayout.setHorizontalGroup(
            removeDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeDissertationPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeDissertationBtn)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        removeDissertationPanelLayout.setVerticalGroup(
            removeDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeDissertationPanelLayout.createSequentialGroup()
                .addGroup(removeDissertationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeDissertationPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removeDissertationPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(removeDissertationBtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        RemoveItemTabbedPane.addTab("Dissertation", removeDissertationPanel);

        jScrollPane22.setViewportView(removeConferenceList);

        removeConferenceBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeConferenceBtn.setText("Remove Conference");
        removeConferenceBtn.setActionCommand("RemoveBook");
        removeConferenceBtn.setOpaque(true);
        removeConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeConferenceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeConferencePanelLayout = new javax.swing.GroupLayout(removeConferencePanel);
        removeConferencePanel.setLayout(removeConferencePanelLayout);
        removeConferencePanelLayout.setHorizontalGroup(
            removeConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeConferencePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeConferenceBtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        removeConferencePanelLayout.setVerticalGroup(
            removeConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeConferencePanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(removeConferencePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(removeConferenceBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RemoveItemTabbedPane.addTab("Conference Paper", removeConferencePanel);

        jScrollPane24.setViewportView(removeJournalList);

        removeJournalBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeJournalBtn.setText("Remove Journal");
        removeJournalBtn.setActionCommand("RemoveBook");
        removeJournalBtn.setOpaque(true);
        removeJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJournalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeJournalPanelLayout = new javax.swing.GroupLayout(removeJournalPanel);
        removeJournalPanel.setLayout(removeJournalPanelLayout);
        removeJournalPanelLayout.setHorizontalGroup(
            removeJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeJournalPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(removeJournalBtn)
                .addGap(33, 33, 33))
        );
        removeJournalPanelLayout.setVerticalGroup(
            removeJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeJournalPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(removeJournalPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(removeJournalBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RemoveItemTabbedPane.addTab("Journal", removeJournalPanel);

        jScrollPane26.setViewportView(removeResearchList);

        removeResearchBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeResearchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeResearchBtn.setText("Remove Research");
        removeResearchBtn.setActionCommand("RemoveBook");
        removeResearchBtn.setOpaque(true);
        removeResearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeResearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchResearchPalettePanel1Layout = new javax.swing.GroupLayout(SearchResearchPalettePanel1);
        SearchResearchPalettePanel1.setLayout(SearchResearchPalettePanel1Layout);
        SearchResearchPalettePanel1Layout.setHorizontalGroup(
            SearchResearchPalettePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResearchPalettePanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(removeResearchBtn)
                .addGap(36, 36, 36))
        );
        SearchResearchPalettePanel1Layout.setVerticalGroup(
            SearchResearchPalettePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchResearchPalettePanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(SearchResearchPalettePanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(removeResearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout removeResearchPanelLayout = new javax.swing.GroupLayout(removeResearchPanel);
        removeResearchPanel.setLayout(removeResearchPanelLayout);
        removeResearchPanelLayout.setHorizontalGroup(
            removeResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeResearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchResearchPalettePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        removeResearchPanelLayout.setVerticalGroup(
            removeResearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeResearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchResearchPalettePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        RemoveItemTabbedPane.addTab("Research Paper", removeResearchPanel);

        
        MagazineSearchList1.setViewportView(removeMagazineList);

        removeMagazineBtn.setBackground(new java.awt.Color(203, 211, 217));
        removeMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        removeMagazineBtn.setText("Remove Magazine");
        removeMagazineBtn.setActionCommand("RemoveBook");
        removeMagazineBtn.setOpaque(true);
        removeMagazineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMagazineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchMagazinePalettePanel1Layout = new javax.swing.GroupLayout(SearchMagazinePalettePanel1);
        SearchMagazinePalettePanel1.setLayout(SearchMagazinePalettePanel1Layout);
        SearchMagazinePalettePanel1Layout.setHorizontalGroup(
            SearchMagazinePalettePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchMagazinePalettePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MagazineSearchList1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(removeMagazineBtn)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        SearchMagazinePalettePanel1Layout.setVerticalGroup(
            SearchMagazinePalettePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMagazinePalettePanel1Layout.createSequentialGroup()
                .addGroup(SearchMagazinePalettePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchMagazinePalettePanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(MagazineSearchList1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchMagazinePalettePanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(removeMagazineBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout removeMagazinePanelLayout = new javax.swing.GroupLayout(removeMagazinePanel);
        removeMagazinePanel.setLayout(removeMagazinePanelLayout);
        removeMagazinePanelLayout.setHorizontalGroup(
            removeMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeMagazinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchMagazinePalettePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        removeMagazinePanelLayout.setVerticalGroup(
            removeMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeMagazinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchMagazinePalettePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        RemoveItemTabbedPane.addTab("Magazine", removeMagazinePanel);


        EditItemPanel.addTab("Remove Item", RemoveItemInnerPanel1);

        AddRemoveInstructionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        AddRemoveInstructionLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddRemoveInstructionLabel.setText("Add/Remove Items");

        javax.swing.GroupLayout AddRemovePaneLayout = new javax.swing.GroupLayout(AddRemovePane);
        AddRemovePane.setLayout(AddRemovePaneLayout);
        AddRemovePaneLayout.setHorizontalGroup(
            AddRemovePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddRemovePaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EditItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(AddRemovePaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddRemoveInstructionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddRemovePaneLayout.setVerticalGroup(
            AddRemovePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddRemovePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddRemoveInstructionLabel)
                .addGap(45, 45, 45)
                .addComponent(EditItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
        );

        MultiPaneLMS.addTab("Add/Remove Items", AddRemovePane);

        GenerateReportPane.setBackground(new java.awt.Color(60, 91, 118));

        GenReportButton.setText("Generate Complete Report");
        GenReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenReportButtonActionPerformed(evt);
            }
        });

        GenReportTree.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        GenReportTree.setSelectionModel(null);
        GenReportTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                GenReportTreeValueChanged(evt);
            }
        });
        GeneratedReportScrollPane.setViewportView(GenReportTree);

        javax.swing.GroupLayout GenerateReportPaneLayout = new javax.swing.GroupLayout(GenerateReportPane);
        GenerateReportPane.setLayout(GenerateReportPaneLayout);
        GenerateReportPaneLayout.setHorizontalGroup(
            GenerateReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateReportPaneLayout.createSequentialGroup()
                .addGroup(GenerateReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerateReportPaneLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(GenReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GenerateReportPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(GeneratedReportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        GenerateReportPaneLayout.setVerticalGroup(
            GenerateReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenerateReportPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(GenReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(GeneratedReportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(795, Short.MAX_VALUE))
        );

        MultiPaneLMS.addTab("Generate Report", GenerateReportPane);

        javax.swing.GroupLayout RootPanelLayout = new javax.swing.GroupLayout(RootPanel);
        RootPanel.setLayout(RootPanelLayout);
        RootPanelLayout.setHorizontalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MultiPaneLMS)
        );
        RootPanelLayout.setVerticalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MultiPaneLMS, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenReportButtonActionPerformed
        /* NOTE <-- NOT IMPLEMENTED YET, NEED TO FINISH BOOK CLASSES
        String BookGenReportStr;
        for (int i; i<BookList.length; i++) {
            BookGenReportStr += BookList.toString();
        }
        ReportTextArea.setText(BookGenReportStr);
        */
    }//GEN-LAST:event_GenReportButtonActionPerformed

    private void GenReportTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_GenReportTreeValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_GenReportTreeValueChanged


//SEARCH BTNS -----------------------------------------------------------
    private void searchMagazineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMagazineBtnActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_searchMagazineBtnActionPerformed

    private void searchResearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchResearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchResearchBtnActionPerformed

    private void searchJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJournalBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJournalBtnActionPerformed

    private void searchConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchConferenceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchConferenceBtnActionPerformed

    private void searchDissertationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDissertationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDissertationBtnActionPerformed

    private void searchThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchThesisBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchThesisBtnActionPerformed

    private void searchBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookBtnActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_searchBookBtnActionPerformed


//ADD BTNS ---------------------------------------------------------------
    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
        if(addBookTitleTxt.getText().isEmpty() && addBookEdNumTxt.getText().isEmpty() && addBookPubYearTxt.getText().isEmpty() && addBookChapTxt.getText().isEmpty() && addBookFigsTxt.getText().isEmpty() && addBookAuthorListTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a book!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = setAuthors(addBookAuthorListTxt.getText());

            //number of authors for array size in classes
            int numAuthors = authors.size();

            //this bookSuper.add is the justAddedBook
            bookSuper.add(new Book(addBookTitleTxt.getText(), addBookPubYearTxt.getText(), numAuthors, addBookPubTxt.getText(), Integer.parseInt(addBookChapTxt.getText()), Integer.parseInt(addBookFigsTxt.getText()), Integer.parseInt(addBookEdNumTxt.getText()) ));
            
            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                Book justAddedBook = bookSuper.get(bookSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedBook.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }

        bookList = new JList<Book>(bookSuper.toArray(new Book[bookSuper.size()]));
    
        }
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void addThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addThesisBtnActionPerformed
        // TODO add your handling code here:
        if(addThesisTitleTxt.getText().isEmpty() && addThesisDepTxt.getText().isEmpty() && addThesisPubYearTxt.getText().isEmpty() && addThesisBuildTxt.getText().isEmpty() && addThesisFigsTxt.getText().isEmpty() && addThesisAuthorTxt.getText().isEmpty() && addThesisCommitteeMemsTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a Thesis!");
        } else {
            //calling setComitteeMems to parse through text field for committee members and committee title of new dissertation/thesis
            List<CommitteeMember> committee = setCommitteeMems(addThesisCommitteeMemsTxt.getText());

            //number of authors for array size in classes
            int numCommittee = committee.size();

            //this bookSuper.add is the justAddedBook
            Department addThesisDepartment = new Department(addThesisBuildTxt.getText(), addThesisDepTxt.getText());
            Chapters addThesisChapter = new Chapters(Integer.parseInt(addThesisChapTxt.getText()));
            Figures addThesisFigure = new Figures(Integer.parseInt(addThesisFigsTxt.getText()));

            thesisSuper.add(new Thesis(addThesisTitleTxt.getText(), addThesisPubYearTxt.getText(), addThesisDepartment, numCommittee, addThesisChapter, addThesisFigure));
            // thesisSuper.author_list[0] = addThesisAuthorTxt.getText();
            

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                Thesis justAddedThesis = thesisSuper.get(thesisSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numCommittee; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedThesis.committeeMembers[num] = committee.get(numCommittee - (1+num));
                }
            }
            thesisList = new JList<Thesis>(thesisSuper.toArray(new Thesis[thesisSuper.size()]));
    
        }   
    }//GEN-LAST:event_addThesisBtnActionPerformed

    private void addDissertationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDissertationBtnActionPerformed
        // TODO add your handling code here:
        if(addDissertationTitleTxt.getText().isEmpty() && addDissertationDepTxt.getText().isEmpty() && addDissertationPubYearTxt.getText().isEmpty() && addDissertationBuildTxt.getText().isEmpty() && addDissertationFigsTxt.getText().isEmpty() && addDissertationAuthorTxt.getText().isEmpty() && addDissertationCommitteeMemsTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a dissertation!");
        } else {
            //calling setComitteeMems to parse through text field for committee members and committee title of new dissertation/thesis
            List<CommitteeMember> committee = setCommitteeMems(addDissertationCommitteeMemsTxt.getText());

            //number of authors for array size in classes
            int numCommittee = committee.size();

            //this bookSuper.add is the justAddedBook
            Department addDissertationDepartment = new Department(addDissertationBuildTxt.getText(), addDissertationDepTxt.getText());
            Chapters addDissertationChapter = new Chapters(Integer.parseInt(addDissertationChapTxt.getText()));
            Figures addDissertationFigure = new Figures(Integer.parseInt(addDissertationFigsTxt.getText()));

            dissertationSuper.add(new Dissertation(addDissertationTitleTxt.getText(), addDissertationPubYearTxt.getText(), addDissertationDepartment, numCommittee, addDissertationChapter, addDissertationFigure));
            //dissertationSuper.author_list[0] = addDissertationAuthorTxt.getText();
            

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                Dissertation justAddedDissertation = dissertationSuper.get(dissertationSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numCommittee; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedDissertation.committeeMembers[num] = committee.get(numCommittee - (1+num));
                }
            }

            dissertationList = new JList<Dissertation>(dissertationSuper.toArray(new Dissertation[dissertationSuper.size()]));
        }
    }//GEN-LAST:event_addDissertationBtnActionPerformed

    private void addConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConferenceBtnActionPerformed
        // TODO add your handling code here:
        if(addConferenceTitleTxt.getText().isEmpty() && addConferencePubYearTxt.getText().isEmpty() && addConferenceAuthorListTxt.getText().isEmpty() && addConferenceNameTxt.getText().isEmpty() && addConferenceLocationTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a conference paper!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = setAuthors(addConferenceAuthorListTxt.getText());

            //number of authors for array size in classes
            int numAuthors = authors.size();


            //for Location and Period
            Location addConferenceLocation = new Location(addConferenceLocationTxt.getText());
            Period addConferencePeriod = new Period(addConferenceBeginDateFrmtTxt.getText(), addConferenceEndDateFrmtTxt.getText());


            //this bookSuper.add is the justAddedBook
            conferenceSuper.add(new ConferencePaper(addConferenceTitleTxt.getText(), addConferencePubYearTxt.getText(), numAuthors, addConferenceNameTxt.getText(), addConferenceLocation, addConferencePeriod));

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                ConferencePaper justAddedConference = conferenceSuper.get(conferenceSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedConference.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }
            conferenceList = new JList<ConferencePaper>(conferenceSuper.toArray(new ConferencePaper[conferenceSuper.size()]));
        }
    }//GEN-LAST:event_addConferenceBtnActionPerformed

    private void addJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJournalBtnActionPerformed
        // TODO add your handling code here:
        if(addJournalTitleTxt.getText().isEmpty() && addJournalPubYearTxt.getText().isEmpty() && addJournalAuthorListTxt.getText().isEmpty() && addJournalNameTxt.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a Journal!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = setAuthors(addJournalAuthorListTxt.getText());
            
            //number of authors for array size in classes
            int numAuthors = authors.size();

            //this bookSuper.add is the justAddedBook
            journalSuper.add(new JournalPaper(addJournalTitleTxt.getText(), addJournalPubYearTxt.getText(), numAuthors, addJournalNameTxt.getText()));

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                JournalPaper justAddedJournal = journalSuper.get(journalSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedJournal.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }
            journalList = new JList<JournalPaper>(journalSuper.toArray(new JournalPaper[journalSuper.size()]));

        }
    }//GEN-LAST:event_addJournalBtnActionPerformed

    private void addResearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResearchBtnActionPerformed
        // TODO add your handling code here:
        if(addResearchTitleTxt.getText().isEmpty() && addResearchPubYearTxt.getText().isEmpty() && addResearchAuthorListTxt.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a book!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = setAuthors(addResearchAuthorListTxt.getText());
              
            //number of authors for array size in classes
            int numAuthors = authors.size();

            //this bookSuper.add is the justAddedBook
            researchSuper.add(new ResearchReport(addResearchTitleTxt.getText(), addResearchPubYearTxt.getText(), numAuthors));

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                ResearchReport justAddedResearch = researchSuper.get(researchSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedResearch.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }
            researchList = new JList<ResearchReport>(researchSuper.toArray(new ResearchReport[researchSuper.size()]));
        }
    }//GEN-LAST:event_addResearchBtnActionPerformed

    private void addMagazineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMagazineBtnActionPerformed
        // TODO add your handling code here:
        if(addMagazineTitleTxt.getText().isEmpty() && addMagazinePubYearTxt.getText().isEmpty() && addBookPubYearTxt.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a book!");
        } else {
            magazineSuper.add(new Magazine(addMagazineTitleTxt.getText(), addMagazinePubYearTxt.getText()));
        }
    }//GEN-LAST:event_addMagazineBtnActionPerformed
          
          
//REMOVE BTNS -------------------------------------------------------------
          
    private void removeBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }            
    }//GEN-LAST:event_removeBookBtnActionPerformed

    private void removeThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeThesisBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeThesisBtnActionPerformed

    private void removeDissertationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDissertationBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeDissertationBtnActionPerformed

    private void removeConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeConferenceBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeConferenceBtnActionPerformed

    private void removeJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJournalBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeJournalBtnActionPerformed

    private void removeResearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeResearchBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeResearchBtnActionPerformed

    private void removeMagazineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMagazineBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeMagazineBtnActionPerformed


//EDIT Btns ---------------------------------------------------
    private void confirmEditBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditBookBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditBookBtnActionPerformed

    private void confirmEditThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditThesisBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditThesisBtnActionPerformed

    private void confirmEditDissertationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditDissertationBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditDissertationBtnActionPerformed

    private void confirmEditConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditConferenceBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditConferenceBtnActionPerformed

    private void confirmEditJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditJournalBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditJournalBtnActionPerformed

    private void confirmEditResearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditResearchBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditResearchBtnActionPerformed

    private void confirmEditMagazineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditMagazineBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            //This is where SQL/Database access information goes.
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmEditMagazineBtnActionPerformed

/* These functions below SHOULD make it so whenever someone selects a book, the edit button appears, 
and if they deselect the items, it disappears. Pretty sure whenever nothing is selected
the index value is -1
*/
    private void SearchBookListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchBookListValueChanged
        if (SearchBookList.getSelectedIndex() == -1) {
            confirmEditBookBtn.setVisible(false);
        } else {
            confirmEditBookBtn.setVisible(true);
        }
    }//GEN-LAST:event_SearchBookListValueChanged

    private void SearchThesisListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchThesisListValueChanged
        if (SearchThesisList.getSelectedIndex() == -1) {
            confirmEditThesisBtn.setVisible(false);
        } else {
            confirmEditThesisBtn.setVisible(true);
        }
    }//GEN-LAST:event_SearchThesisListValueChanged

    private void SearchDissertationListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchDissertationListValueChanged
        if (SearchDissertationList.getSelectedIndex() == -1) {
            confirmEditDissertationBtn.setVisible(false);
        } else {
            confirmEditDissertationBtn.setVisible(true);
        }
    }//GEN-LAST:event_SearchDissertationListValueChanged

    private void SearchConferenceListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchConferenceListValueChanged
        if (SearchConferenceList.getSelectedIndex() == -1) {
            confirmEditConferenceBtn.setVisible(false);
        } else {
            confirmEditConferenceBtn.setVisible(true);
        }        
    }//GEN-LAST:event_SearchConferenceListValueChanged

    private void SearchJournalListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchJournalListValueChanged
        if (SearchJournalList.getSelectedIndex() == -1) {
            confirmEditJournalBtn.setVisible(false);
        } else {
            confirmEditJournalBtn.setVisible(true);
        }  
    }//GEN-LAST:event_SearchJournalListValueChanged

    private void SearchResearchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchResearchListValueChanged
        if (SearchResearchList.getSelectedIndex() == -1) {
            confirmEditResearchBtn.setVisible(false);
        } else {
            confirmEditResearchBtn.setVisible(true);
        }  
    }//GEN-LAST:event_SearchResearchListValueChanged

    private void SearchMagazineListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SearchMagazineListValueChanged
        if (SearchMagazineList.getSelectedIndex() == -1) {
            confirmEditMagazineBtn.setVisible(false);
        } else {
            confirmEditMagazineBtn.setVisible(true);
        }  
    }//GEN-LAST:event_SearchMagazineListValueChanged

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
            */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(LMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(LMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(LMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LMS().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBookAuthorInstructionLabel;
    private javax.swing.JLabel AddConferenceAuthorInstructionLabel;
    private javax.swing.JLabel AddBookAuthorLabel;
    private javax.swing.JLabel AddBookChapLabel;
    private javax.swing.JLabel AddBookEdNumLabel;
    private javax.swing.JLabel AddBookFigLabel;
    private javax.swing.JPanel AddBookPanel;
    private javax.swing.JLabel AddBookPubLabel;
    private javax.swing.JLabel AddBookPubYearLabel;
    private javax.swing.JLabel AddBookTitleLabel;
    private javax.swing.JLabel AddConferenceAuthorLabel;
    private javax.swing.JLabel AddConferenceNameLabel;
    private javax.swing.JPanel AddConferencePanel;
    private javax.swing.JLabel AddDissertationAuthorLabel;
    private javax.swing.JLabel AddDissertationBuildLabel;
    private javax.swing.JLabel AddDissertationChapLabel;
    private javax.swing.JLabel AddDissertationCommitteeMemInstructionLabel;
    private javax.swing.JLabel AddDissertationDepLabel;
    private javax.swing.JLabel AddDissertationFigsLabel;
    private javax.swing.JPanel AddDissertationPanel;
    private javax.swing.JLabel AddDissertationPubYearLabel;
    private javax.swing.JLabel AddConferencePubYearLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JTabbedPane AddItemTabbedPane;
    private javax.swing.JLabel AddJournalAuthorInstructionLabel;
    private javax.swing.JLabel AddJournalAuthorLabel;
    private javax.swing.JPanel AddJournalPanel;
    private javax.swing.JPanel AddMagazinePanel;
    private javax.swing.JLabel AddRemoveInstructionLabel;
    private javax.swing.JPanel AddRemovePane;
    private javax.swing.JLabel AddResearchAuthorInstructionLabel;
    private javax.swing.JLabel AddResearchAuthorLabel;
    private javax.swing.JPanel AddResearchPanel;
    private javax.swing.JLabel AddThesisAuthorLabel;
    private javax.swing.JLabel AddThesisBuildLabel;
    private javax.swing.JLabel AddThesisChapLabel;
    private javax.swing.JLabel AddThesisCommitteeMemInstructionLabel;
    private javax.swing.JLabel AddThesisCommitteeMemLabel;
    private javax.swing.JLabel AddDissertationCommitteeMemLabel;
    private javax.swing.JLabel AddThesisDepLabel;
    private javax.swing.JLabel AddThesisFigLabel;
    private javax.swing.JPanel AddThesisPanel;
    private javax.swing.JLabel AddThesisPubYear;
    private javax.swing.JTabbedPane EditItemPanel;
    private javax.swing.JButton GenReportButton;
    private javax.swing.JTree GenReportTree;
    private javax.swing.JPanel GenerateReportPane;
    private javax.swing.JScrollPane GeneratedReportScrollPane;
    private javax.swing.JLabel ItmSearchDescLabel;
    private javax.swing.JLabel ItmSearchLabel;
    private javax.swing.JScrollPane MagazineSearchList;
    private javax.swing.JScrollPane MagazineSearchList1;
    private javax.swing.JScrollPane MagazineSearchList2;
    private javax.swing.JTabbedPane MultiPaneLMS;
    private javax.swing.JPanel RemoveItemInnerPanel1;
    private javax.swing.JTabbedPane RemoveItemTabbedPane;
    private javax.swing.JTabbedPane RemoveItemTabbedPane1;
    private javax.swing.JPanel RootPanel;
    private javax.swing.JLabel SearchBookAuthorLabel;
    private javax.swing.JLabel SearchBookAuthorLabel2;
    private javax.swing.JLabel SearchBookChapLabel;
    // private javax.swing.JLabel SearchBookChapLabel2;
    private javax.swing.JLabel SearchBookEdNumLabel;
    // private javax.swing.JLabel SearchBookEdNumLabel2;
    private javax.swing.JLabel SearchBookFigsLabel;
    // private javax.swing.JLabel SearchBookFigsLabel2;
    private javax.swing.JList<String> SearchBookList;
    private javax.swing.JPanel SearchBookPanel;
    private javax.swing.JLabel SearchBookPubLabel;
    private javax.swing.JLabel SearchBookPubLabel2;
    private javax.swing.JLabel SearchBookPubYearLabel;
    private javax.swing.JLabel SearchBookPubYearLabel2;
    private javax.swing.JLabel SearchBookTitleLabel;
    private javax.swing.JLabel SearchConferenceAuthorLabel;
    private javax.swing.JTextField searchConferenceAuthorTxt;
    private javax.swing.JList<String> SearchConferenceList;
    private javax.swing.JLabel SearchConferenceNameLabel;
    private javax.swing.JLabel SearchConferenceNameLabel2;
    private javax.swing.JPanel SearchConferencePanel;
    private javax.swing.JLabel SearchConferencePublicationLabel;
    private javax.swing.JLabel SearchConferencePublicationLabel2;
    private javax.swing.JLabel SearchDissertationAuthorLabel;
    private javax.swing.JLabel SearchDissertationAuthorLabel2;
    private javax.swing.JLabel SearchDissertationChapLabel;
    private javax.swing.JLabel SearchDissertationCommitteeMemLabel;
    private javax.swing.JLabel SearchDissertationDepLabel;
    private javax.swing.JLabel SearchDissertationDepLabel2;
    private javax.swing.JLabel SearchDissertationFigsLabel;
    private javax.swing.JLabel SearchDissertationFigsLabel2;
    private javax.swing.JList<String> SearchDissertationList;
    private javax.swing.JPanel SearchDissertationPanel;
    private javax.swing.JLabel SearchDissertationPubYearLabel;
    private javax.swing.JLabel SearchDissertationPubYearLabel2;
    private javax.swing.JLabel SearchDissertationTitleLabel;
    private javax.swing.JLabel SearchJournalAuthorLabel;
    private javax.swing.JList<String> SearchJournalList;
    private javax.swing.JLabel SearchJournalNameLabel;
    private javax.swing.JLabel SearchJournalNameLabel2;
    private javax.swing.JPanel SearchJournalPanel;
    private javax.swing.JLabel SearchJournalPubYearLabel;
    private javax.swing.JLabel SearchJournalPubYearLabel2;
    private javax.swing.JLabel SearchJournalTitleLabel;
    private javax.swing.JLabel SearchThesisTitleLabel1;
    private javax.swing.JLabel SearchMagazineTitleLabel;
    private javax.swing.JLabel SearchConferenceTitleLabel;
    private javax.swing.JList<String> SearchMagazineList;
    private javax.swing.JPanel SearchMagazinePalettePanel;
    private javax.swing.JPanel SearchMagazinePalettePanel1;
    private javax.swing.JPanel SearchMagazinePalettePanel2;
    private javax.swing.JPanel SearchMagazinePanel;
    private javax.swing.JLabel SearchMagazinePubYearLabel;
    private javax.swing.JLabel SearchMagazinePubYearLabel2;
    private javax.swing.JLabel SearchMagazineTitleLablel;
    private javax.swing.JLabel SearchMagazineTitleLablel2;
    private javax.swing.JPanel SearchPane;
    private javax.swing.JLabel SearchResearchAuthorLabel;
    private javax.swing.JList<String> SearchResearchList;
    private javax.swing.JPanel SearchResearchPalettePanel;
    private javax.swing.JPanel SearchResearchPalettePanel1;
    private javax.swing.JPanel SearchResearchPalettePanel2;
    private javax.swing.JPanel SearchResearchPanel;
    private javax.swing.JLabel SearchResearchPubYearLabel;
    private javax.swing.JLabel SearchResearchPubYearLabel2;
    private javax.swing.JLabel SearchResearchTitleLabel;
    private javax.swing.JLabel SearchResearchTitleLabel2;
    private javax.swing.JTabbedPane SearchTabbedPanel;
    private javax.swing.JLabel SearchThesisAuthorLabel;
    private javax.swing.JLabel SearchThesisAuthorLabel2;
    private javax.swing.JLabel SearchThesisBuildLabel;
    private javax.swing.JLabel SearchThesisChapLabel;
    private javax.swing.JLabel SearchThesisChapLabel2;
    private javax.swing.JLabel SearchThesisCommitteeMemLabel;
    private javax.swing.JLabel SearchConferenceCommitteeMemLabel;
    private javax.swing.JLabel SearchThesisDepLabel;
    private javax.swing.JLabel SearchThesisDepLabel2;
    private javax.swing.JLabel SearchThesisFigsLabel;
    private javax.swing.JLabel SearchThesisFigsLabel2;
    private javax.swing.JList<String> SearchThesisList;
    private javax.swing.JPanel SearchThesisPanel;
    private javax.swing.JLabel SearchThesisPubYearLabel;
    private javax.swing.JLabel SearchThesisPubYearLabel2;
    private javax.swing.JLabel SearchThesisTitleLabel;
    private javax.swing.JLabel SearchThesisTitleLabel2;
    private javax.swing.JTextField addBookAuthorListTxt;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JTextField addBookChapTxt;
    private javax.swing.JTextField addBookEdNumTxt;
    private javax.swing.JTextField addBookFigsTxt;
    private javax.swing.JTextField addBookPubTxt;
    private javax.swing.JTextField addBookPubYearTxt;
    private javax.swing.JTextField addBookTitleTxt;
    private javax.swing.JTextField addConferenceAuthorListTxt;
    private javax.swing.JFormattedTextField addConferenceBeginDateFrmtTxt;
    private javax.swing.JButton addConferenceBtn;
    private javax.swing.JFormattedTextField addConferenceEndDateFrmtTxt;
    private javax.swing.JLabel addConferenceEndDateLabel;
    private javax.swing.JLabel addConferenceLocationLabel;
    private javax.swing.JTextField addConferenceLocationTxt;
    private javax.swing.JTextField addConferenceNameTxt;
    private javax.swing.JTextField addConferencePubYearTxt;
    private javax.swing.JLabel addConferenceStartDateLabel;
    private javax.swing.JTextField addConferenceTitleTxt;
    private javax.swing.JTextField addDissertationAuthorTxt;
    private javax.swing.JButton addDissertationBtn;
    private javax.swing.JTextField addDissertationBuildTxt;
    private javax.swing.JTextField addDissertationChapTxt;
    private javax.swing.JTextField addDissertationCommitteeMemsTxt;
    private javax.swing.JTextField addDissertationDepTxt;
    private javax.swing.JTextField addDissertationFigsTxt;
    private javax.swing.JTextField addDissertationPubYearTxt;
    private javax.swing.JLabel addDissertationTitleLabel;
    private javax.swing.JLabel addConferenceTitleLabel;
    private javax.swing.JTextField addDissertationTitleTxt;
    private javax.swing.JTextField addJournalAuthorListTxt;
    private javax.swing.JButton addJournalBtn;
    private javax.swing.JLabel addJournalNameLabel;
    private javax.swing.JTextField addJournalNameTxt;
    private javax.swing.JLabel addJournalPubYearLabel;
    private javax.swing.JTextField addJournalPubYearTxt;
    private javax.swing.JLabel addJournalTitleLabel;
    private javax.swing.JTextField addJournalTitleTxt;
    private javax.swing.JButton addMagazineBtn;
    private javax.swing.JLabel addMagazinePubYearLabel;
    private javax.swing.JTextField addMagazinePubYearTxt;
    private javax.swing.JLabel addMagazineTitleLabel;
    private javax.swing.JTextField addMagazineTitleTxt;
    private javax.swing.JTextField addResearchAuthorListTxt;
    private javax.swing.JButton addResearchBtn;
    private javax.swing.JLabel addResearchPubYearLabel;
    private javax.swing.JTextField addResearchPubYearTxt;
    private javax.swing.JLabel addResearchTitleLabel;
    private javax.swing.JTextField addResearchTitleTxt;
    private javax.swing.JTextField addThesisAuthorTxt;
    private javax.swing.JButton addThesisBtn;
    private javax.swing.JTextField addThesisBuildTxt;
    private javax.swing.JTextField addThesisChapTxt;
    private javax.swing.JTextField addThesisCommitteeMemsTxt;
    private javax.swing.JTextField addThesisDepTxt;
    private javax.swing.JTextField addThesisFigsTxt;
    private javax.swing.JTextField addThesisPubYearTxt;
    private javax.swing.JLabel addThesisTitleLabel;
    private javax.swing.JTextField addThesisTitleTxt;
    private javax.swing.JButton confirmEditBookBtn;
    private javax.swing.JButton confirmEditConferenceBtn;
    private javax.swing.JButton confirmEditDissertationBtn;
    private javax.swing.JButton confirmEditJournalBtn;
    private javax.swing.JButton confirmEditMagazineBtn;
    private javax.swing.JButton confirmEditResearchBtn;
    private javax.swing.JButton confirmEditThesisBtn;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> removeBookAuthorList1;
    private javax.swing.JButton removeBookBtn;
    private javax.swing.JButton removeBookBtn1;
    private javax.swing.JTextField removeBookChapTxt1;
    private javax.swing.JTextField removeBookFigsTxt1;
    private javax.swing.JList<String> removeBookList;
    private javax.swing.JPanel removeBookPanel;
    private javax.swing.JPanel removeBookPanel1;
    private javax.swing.JTextField removeBookPubYearTxt1;
    private javax.swing.JTextField removeBookPublisherTxt1;
    private javax.swing.JLabel removeBookTitleLabel1;
    private javax.swing.JTextField removeBookTitleTxt1;
    private javax.swing.JList<String> removeConferenceAuthorList1;
    private javax.swing.JButton removeConferenceBtn;
    private javax.swing.JButton removeConferenceBtn1;
    private javax.swing.JList<String> removeConferenceList;
    private javax.swing.JTextField removeConferenceNameTxt1;
    private javax.swing.JPanel removeConferencePanel;
    private javax.swing.JPanel removeConferencePanel1;
    private javax.swing.JTextField removeConferencePubYearTxt1;
    private javax.swing.JTextField removeConferenceTitleTxt1;
    private javax.swing.JButton removeDIssertationBtn1;
    private javax.swing.JTextField removeDissertationAuthorTxt1;
    private javax.swing.JButton removeDissertationBtn;
    private javax.swing.JTextField removeDissertationChapTxt1;
    private javax.swing.JList<String> removeDissertationCommiteeMemList1;
    private javax.swing.JTextField removeDissertationDepTxt1;
    private javax.swing.JTextField removeDissertationFigsTxt1;
    private javax.swing.JList<String> removeDissertationList;
    private javax.swing.JPanel removeDissertationPanel;
    private javax.swing.JPanel removeDissertationPanel1;
    private javax.swing.JTextField removeDissertationPubYearTxt1;
    private javax.swing.JTextField removeDissertationTitleTxt1;
    private javax.swing.JList<String> removeJournalAuthorList1;
    private javax.swing.JButton removeJournalBtn;
    private javax.swing.JButton removeJournalBtn1;
    private javax.swing.JList<String> removeJournalList;
    private javax.swing.JTextField removeJournalNameTxt1;
    private javax.swing.JPanel removeJournalPanel;
    private javax.swing.JPanel removeJournalPanel1;
    private javax.swing.JTextField removeJournalPubYearTxt1;
    private javax.swing.JTextField removeJournalTitleTxt1;
    private javax.swing.JButton removeMagazineBtn;
    private javax.swing.JButton removeMagazineBtn1;
    private javax.swing.JList<String> removeMagazineList;
    private javax.swing.JPanel removeMagazinePanel;
    private javax.swing.JPanel removeMagazinePanel1;
    private javax.swing.JTextField removeMagazinePubYearTxt1;
    private javax.swing.JTextField removeMagazineTitleTxt1;
    private javax.swing.JList<String> removeResearchAuthorList1;
    private javax.swing.JButton removeResearchBtn;
    private javax.swing.JButton removeResearchBtn1;
    private javax.swing.JList<String> removeResearchList;
    private javax.swing.JPanel removeResearchPanel;
    private javax.swing.JPanel removeResearchPanel1;
    private javax.swing.JTextField removeResearchPubYearTxt1;
    private javax.swing.JTextField removeResearchTitleTxt1;
    private javax.swing.JButton removeSearchBookBtn1;
    private javax.swing.JList<String> removeSearchBookList1;
    private javax.swing.JFormattedTextField removeSearchConferenceBeginDateFrmtTxt1;
    private javax.swing.JLabel removeSearchConferenceBeginDateLabel1;
    private javax.swing.JButton removeSearchConferenceBtn1;
    private javax.swing.JFormattedTextField removeSearchConferenceEndDateFrmtTxt1;
    private javax.swing.JLabel removeSearchConferenceEndDateLabel1;
    private javax.swing.JList<String> removeSearchConferenceList1;
    private javax.swing.JButton removeSearchDissertationBtn1;
    private javax.swing.JList<String> removeSearchDissertationList1;
    private javax.swing.JButton removeSearchJournalBtn1;
    private javax.swing.JList<String> removeSearchJournalList1;
    private javax.swing.JButton removeSearchMagazineBtn1;
    private javax.swing.JList<String> removeSearchMagazineList1;
    private javax.swing.JButton removeSearchResearchBtn1;
    private javax.swing.JList<String> removeSearchResearchList1;
    private javax.swing.JButton removeSearchThesisBtn1;
    private javax.swing.JList<String> removeSearchThesisList1;
    private javax.swing.JTextField removeThesisAuthorTxt1;
    private javax.swing.JButton removeThesisBtn;
    private javax.swing.JButton removeThesisBtn1;
    private javax.swing.JTextField removeThesisChapTxt1;
    private javax.swing.JList<String> removeThesisCommiteeMemList1;
    private javax.swing.JTextField removeThesisDepTxt1;
    private javax.swing.JTextField removeThesisFigsTxt1;
    private javax.swing.JList<String> removeThesisList;
    private javax.swing.JPanel removeThesisPanel;
    private javax.swing.JTextField searchBookAuthorTxt;
    private javax.swing.JButton searchBookBtn;
    private javax.swing.JTextField searchBookChapTxt;
    private javax.swing.JTextField searchBookEdNumTxt;
    private javax.swing.JTextField searchBookEdNumTxt2;
    private javax.swing.JTextField searchBookFigsTxt;
    private javax.swing.JTextField searchBookPubTxt;
    private javax.swing.JTextField searchBookPubYearTxt;
    private javax.swing.JTextField searchBookTitleTxt;
    private javax.swing.JFormattedTextField searchConferenceBeginDateFrmtTxt;
    private javax.swing.JLabel searchConferenceBeginDateLabel;
    private javax.swing.JButton searchConferenceBtn;
    private javax.swing.JFormattedTextField searchConferenceEndDateFrmtTxt;
    private javax.swing.JLabel searchConferenceEndDateLabel;
    private javax.swing.JTextField searchConferenceNameTxt;
    private javax.swing.JTextField searchConferencePubYearTxt;
    private javax.swing.JTextField searchConferenceTitleTxt;
    private javax.swing.JTextField searchConferencelAuthorTxt;
    private javax.swing.JTextField searchDisseratationTitleTxt;
    private javax.swing.JTextField searchDissertationAuthorTxt;
    private javax.swing.JButton searchDissertationBtn;
    private javax.swing.JTextField searchDissertationBuildTxt;
    private javax.swing.JLabel searchDissertationBuildingLabel;
    private javax.swing.JTextField searchDissertationChapTxt;
    private javax.swing.JTextField searchDissertationCommitteeMemTxt;
    private javax.swing.JTextField searchDissertationDepTxt;
    private javax.swing.JTextField searchDissertationFigsTxt;
    private javax.swing.JTextField searchDissertationPubYearTxt;
    private javax.swing.JTextField searchJournalAuthorTxt;
    private javax.swing.JButton searchJournalBtn;
    private javax.swing.JTextField searchJournalNameTxt;
    private javax.swing.JTextField searchJournalPubYearTxt;
    private javax.swing.JTextField searchJournalTitleTxt;
    private javax.swing.JButton searchMagazineBtn;
    private javax.swing.JTextField searchMagazinePubYearTxt;
    private javax.swing.JTextField searchMagazineTitleTxt;
    private javax.swing.JTextField searchResearchAuthorTxt;
    private javax.swing.JButton searchResearchBtn;
    private javax.swing.JTextField searchResearchPubYearTxt;
    private javax.swing.JTextField searchResearchTitleTxt;
    private javax.swing.JTextField searchThesisAuthorTxt;
    private javax.swing.JButton searchThesisBtn;
    private javax.swing.JTextField searchThesisBuildTxt;
    private javax.swing.JTextField searchThesisChapTxt;
    private javax.swing.JTextField searchThesisCommitteeMemTxt;
    private javax.swing.JTextField searchThesisDepTxt;
    private javax.swing.JTextField searchThesisFigsTxt;
    private javax.swing.JTextField searchThesisPubYearTxt;
    private javax.swing.JTextField searchThesisTitleTxt;
    // End of variables declaration//GEN-END:variables
    }
