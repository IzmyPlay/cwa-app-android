package de.rki.coronawarnapp.main.home

import android.content.Context
import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import testhelpers.BaseTest

class SubmissionCardStateTest : BaseTest() {

    @MockK(relaxed = true) lateinit var context: Context

    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)
    }

    @AfterEach
    fun teardown() {
        clearAllMocks()
    }

    @Test
    fun `risk card visibility`() {
        TODO("isRiskCardVisible")
//         private fun formatShowRiskStatusCardBase(oDeviceUIState: DeviceUIState?, iResult: Int) {
//        val result = formatShowRiskStatusCard(deviceUiState = oDeviceUIState)
//        assertThat(result, `is`(iResult))
//    }
//    @Test
//    fun formatShowRiskStatusCard() {
//        formatShowRiskStatusCardBase(oDeviceUIState = null, iResult = View.VISIBLE)
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NEGATIVE,
//            iResult = View.VISIBLE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_ERROR,
//            iResult = View.VISIBLE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NO_RESULT,
//            iResult = View.VISIBLE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE,
//            iResult = View.GONE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE_TELETAN,
//            iResult = View.GONE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_FINAL,
//            iResult = View.GONE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_INITIAL,
//            iResult = View.VISIBLE
//        )
//        formatShowRiskStatusCardBase(
//            oDeviceUIState = DeviceUIState.UNPAIRED,
//            iResult = View.VISIBLE
//        )
//    }
    }

    @Test
    fun `unregistered card visibility`() {
        TODO("isUnregisteredCardVisible")
    }

    @Test
    fun `content card visibility`() {
        TODO("isContentCardVisible")
//          private fun formatSubmissionStatusCardContentVisibleBase(
//        oDeviceUiState: DeviceUIState?,
//        iResult: Int
//    ) {
//        val result =
//            formatSubmissionStatusCardContentVisible(deviceUiState = oDeviceUiState)
//        assertThat(result, `is`(iResult))
//    }
//    @Test
//    fun formatSubmissionStatusCardContentVisible() {
//        formatSubmissionStatusCardContentVisibleBase(oDeviceUiState = null, iResult = View.GONE)
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.PAIRED_NEGATIVE,
//            iResult = View.VISIBLE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.PAIRED_ERROR,
//            iResult = View.VISIBLE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.PAIRED_NO_RESULT,
//            iResult = View.VISIBLE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.PAIRED_POSITIVE,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.PAIRED_POSITIVE_TELETAN,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.SUBMITTED_FINAL,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.SUBMITTED_INITIAL,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardContentVisibleBase(
//            oDeviceUiState = DeviceUIState.UNPAIRED,
//            iResult = View.GONE
//        )
//    }
    }

    @Test
    fun `fetching card visibility`() {
        TODO("isFetchingCardVisible")
//        private fun formatSubmissionStatusCardFetchingVisibleBase(
//        bDeviceRegistered: Boolean?,
//        bUiStateState: ApiRequestState?,
//        iResult: Int
//    ) {
//        val result = formatSubmissionStatusCardFetchingVisible(
//            deviceRegistered = bDeviceRegistered,
//            uiStateState = bUiStateState
//        )
//        assertThat(result, `is`(iResult))
//    }
//    @Test
//    fun formatSubmissionStatusCardFetchingVisible() {
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = null,
//            bUiStateState = null,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = null,
//            bUiStateState = ApiRequestState.SUCCESS,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = null,
//            bUiStateState = ApiRequestState.STARTED,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = null,
//            bUiStateState = ApiRequestState.IDLE,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = null,
//            bUiStateState = ApiRequestState.FAILED,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = false,
//            bUiStateState = ApiRequestState.SUCCESS,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = false,
//            bUiStateState = ApiRequestState.STARTED,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = false,
//            bUiStateState = ApiRequestState.IDLE,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = false,
//            bUiStateState = ApiRequestState.FAILED,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = true,
//            bUiStateState = ApiRequestState.SUCCESS,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = true,
//            bUiStateState = ApiRequestState.STARTED,
//            iResult = View.VISIBLE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = true,
//            bUiStateState = ApiRequestState.IDLE,
//            iResult = View.GONE
//        )
//        formatSubmissionStatusCardFetchingVisibleBase(
//            bDeviceRegistered = true,
//            bUiStateState = ApiRequestState.FAILED,
//            iResult = View.VISIBLE
//        )
//    }
    }

    @Test
    fun `submission positive result card visibility`() {
        TODO("isPositiveSubmissionCardVisible")
//        private fun formatShowSubmissionStatusPositiveCardBase(
//        oDeviceUIState: DeviceUIState?,
//        iResult: Int
//    ) {
//        val result = formatShowSubmissionStatusPositiveCard(deviceUiState = oDeviceUIState)
//        assertThat(result, `is`(iResult))
//    }
//    @Test
//    fun formatShowSubmissionStatusPositiveCard() {
//        formatShowSubmissionStatusPositiveCardBase(oDeviceUIState = null, iResult = View.GONE)
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NEGATIVE,
//            iResult = View.GONE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_ERROR,
//            iResult = View.GONE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NO_RESULT,
//            iResult = View.GONE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE,
//            iResult = View.VISIBLE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE_TELETAN,
//            iResult = View.VISIBLE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_FINAL,
//            iResult = View.GONE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_INITIAL,
//            iResult = View.GONE
//        )
//        formatShowSubmissionStatusPositiveCardBase(
//            oDeviceUIState = DeviceUIState.UNPAIRED,
//            iResult = View.GONE
//        )
//    }
    }

    @Test
    fun `submission done  card visibility`() {
        TODO("isSubmissionDoneCardVisible")
//         private fun formatShowSubmissionDoneCardBase(oDeviceUIState: DeviceUIState?, iResult: Int) {
//        val result = formatShowSubmissionDoneCard(deviceUiState = oDeviceUIState)
//        assertThat(result, `is`(iResult))
//    }
//
//
//    @Test
//    fun formatShowSubmissionDoneCard() {
//        formatShowSubmissionDoneCardBase(oDeviceUIState = null, iResult = View.GONE)
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NEGATIVE,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_ERROR,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_NO_RESULT,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.PAIRED_POSITIVE_TELETAN,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_FINAL,
//            iResult = View.VISIBLE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.SUBMITTED_INITIAL,
//            iResult = View.GONE
//        )
//        formatShowSubmissionDoneCardBase(
//            oDeviceUIState = DeviceUIState.UNPAIRED,
//            iResult = View.GONE
//        )
//    }
    }
}
