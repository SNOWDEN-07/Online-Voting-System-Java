@Entity
public class Voter {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenertionType.email)
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String name;
    private String email;
    private String password;
    private boolean voted = false;
    public boolean isVoted() {
        throw new UnsupportedOperationException("Unimplemented method 'isVoted'");
    }
    public void setVoted(boolean b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setVoted'");
    }

    // Getters & Setters
}
