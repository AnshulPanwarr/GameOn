package eu.tutorials.g1.model

data class Event(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val sportId: String = "",
    val venueId: String = "",
    val date: Long = 0,
    val startTime: String = "", 
    val endTime: String = "",  
    val maxParticipants: Int = 0,
    val currentParticipants: Int = 0,
    val participants: List<String> = emptyList(), 
    val organizerId: String = "",
    val price: Double = 0.0,
    val skillLevel: SkillLevel = SkillLevel.ALL,
    val status: EventStatus = EventStatus.UPCOMING,
    val type: EventType = EventType.CASUAL,
    val rules: List<String> = emptyList(),
    val equipment: List<String> = emptyList(),
    val isPrivate: Boolean = false,
    val inviteCode: String? = null
)

enum class SkillLevel {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED,
    ALL
}

enum class EventStatus {
    UPCOMING,
    ONGOING,
    COMPLETED,
    CANCELLED
}

enum class EventType {
    CASUAL,     
    TOURNAMENT, 
    TRAINING,   
    LEAGUE      
} 
