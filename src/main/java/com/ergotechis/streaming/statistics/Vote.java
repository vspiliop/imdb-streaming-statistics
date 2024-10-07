package com.ergotechis.streaming.statistics;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Builder(toBuilder = true)
@Data
@Jacksonized
public class Vote {
  long rating;
  String titleId;
  long currentTotalVotesCounter;
}
