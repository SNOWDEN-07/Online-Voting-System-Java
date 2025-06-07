@RestController
@RequestMapping("/api/vote")
public class VoteController {
    @Autowired private VoteService voteService;

    @PostMapping(value = "")
    public ResponseEntity<String> vote(@RequestBody Long voterId, @RequestParam Long candidateId) {
        return ResponseEntity.ok(voteService.castVote(voterId, candidateId));
    }
}
