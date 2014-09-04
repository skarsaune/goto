public class SwitchStatus {
  void switchStatus(Status status) {
    switch (status) {
    case MAYBE:
    case YES:
      return;
    default:
      break;
    }
  }
}
