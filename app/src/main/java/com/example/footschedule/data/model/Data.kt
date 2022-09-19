package com.example.footschedule.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("aggregated_winner_code")
    val aggregatedWinnerCode: Any?,
    @SerializedName("attendance")
    val attendance: Int?,
    @SerializedName("away_score")
    val awayScore: AwayScore?,
    @SerializedName("away_team")
    val awayTeam: AwayTeam?,
    @SerializedName("away_team_id")
    val awayTeamId: Int?,
    @SerializedName("cards_code")
    val cardsCode: String?,
    @SerializedName("challenge")
    val challenge: Challenge?,
    @SerializedName("challenge_id")
    val challengeId: Int?,
    @SerializedName("coverage")
    val coverage: Int?,
    @SerializedName("cup_match_in_round")
    val cupMatchInRound: Int?,
    @SerializedName("cup_match_order")
    val cupMatchOrder: Any?,
    @SerializedName("default_period_count")
    val defaultPeriodCount: Int?,
    @SerializedName("event_data_change")
    val eventDataChange: String?,
    @SerializedName("first_supply")
    val firstSupply: Int?,
    @SerializedName("ground_type")
    val groundType: String?,
    @SerializedName("home_score")
    val homeScore: HomeScore?,
    @SerializedName("home_team")
    val homeTeam: HomeTeam?,
    @SerializedName("home_team_id")
    val homeTeamId: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lasted_period")
    val lastedPeriod: String?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("league_id")
    val leagueId: Int?,
    @SerializedName("main_odds")
    val mainOdds: MainOdds?,
    @SerializedName("medias_count")
    val mediasCount: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("periods")
    val periods: Periods?,
    @SerializedName("periods_time")
    val periodsTime: PeriodsTime?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("referee_id")
    val refereeId: Int?,
    @SerializedName("result_only")
    val resultOnly: Boolean?,
    @SerializedName("round_info")
    val roundInfo: RoundInfo?,
    @SerializedName("round_number")
    val roundNumber: Int?,
    @SerializedName("season")
    val season: Season?,
    @SerializedName("season_id")
    val seasonId: Int?,
    @SerializedName("section")
    val section: Section?,
    @SerializedName("series_count")
    val seriesCount: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("sport")
    val sport: Sport?,
    @SerializedName("sport_id")
    val sportId: Int?,
    @SerializedName("start_at")
    val startAt: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("status_lineup")
    val statusLineup: Int?,
    @SerializedName("status_more")
    val statusMore: String?,
    @SerializedName("time_details")
    val timeDetails: Any?,
    @SerializedName("venue_id")
    val venueId: Int?,
    @SerializedName("winner_code")
    val winnerCode: Int?
)