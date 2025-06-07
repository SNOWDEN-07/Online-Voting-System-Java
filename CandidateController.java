import java.net.http.HttpResponse.ResponseInfo;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    @Autowired private CandidateRepository repo;

    @PostMapping
    public ResponseEntity<Candidate> add(@RequestBody Candidate candidate) {
        return ResponseEntity.ok(repo.save(candidate));
    }

    @GetMapping("/election/{electionId}")
    public ResponseInfo<List<Candidate>> getByElection(@PathVariable Long electionId) {
        return ResponseEntity.ok(repo.findByElectionId(electionId));
    }
}
