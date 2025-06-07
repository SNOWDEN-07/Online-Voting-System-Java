@Entity
public class Candidate {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.id)
    private Long id;
    public Candidate(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String name;
    private String party;
    private int votes = 0;

    @ManyToOne
    private Election election;

    public void setVotes(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVotes'");
    }

    public int getVotes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVotes'");
    }

    // Getters & Setters
}
