@RestController
@RequestMapping("/api/voters")
public class VoterController {
    @Autowired private VoterService voterService;

    @PostMapping("/register")
    public ResponseEntity<Voter> register(@RequestBody Voter voter) {
        return ResponseEntity.ok(voterService.register(voter));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        Voter voter = voterService.login(credentials.get("email"), credentials.get("password"));
        return (voter != null) ? ResponseEntity.ok("Login successful.") :
                                 ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed.");
    }
}
