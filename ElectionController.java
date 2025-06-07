@RestController
@RequestMapping("/api/elections")
public class ElectionController {
    @Autowired private ElectionRepository repo;

    @PostMapping
    public ResponseEntity<Election> create(@RequestBody Election election) {
        return ResponseEntity.ok(repo.save(election));
    }

    @GetMapping
    public ResponseEntity<List<Election>> getAll() {
        return ResponseEntity.ok(repo.findAll());
    }
}
