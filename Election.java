import java.time.LocalDate;

@Entity
public class Election {
    private static final String CascadeType = null;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate endDate;

    @OneToMany(mappedBy = "election", cascade = CascadeType.ALL)
    private List<Candidate> candidates;

    // Getters & Setters
}
