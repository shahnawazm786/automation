package browserstack;

public interface IBrowserStackStatus {
    final String STATUS_PASSED_JS="browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}";
    final String STATUS_FAILED_JS="browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"Title not matched!\"}}";
}
