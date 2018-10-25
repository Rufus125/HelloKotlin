
package es.voghdev.hellokotlin

import com.nhaarman.mockito_kotlin.argumentCaptor
import com.nhaarman.mockito_kotlin.whenever
import es.voghdev.hellokotlin.domain.ResLocator
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyList
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MainPresenterTest {
    @Mock
    lateinit var mockUserRepository: UserRepository

    @Mock lateinit var mockResLocator: ResLocator

    @Mock
    lateinit var mockView: MainPresenter.MVPView

    @Mock
    lateinit var mockGetUsersApi: GetUsers

    @Mock
    lateinit var mockGetUsersDb: GetUsers

    @Mock
    lateinit var mockInsertUser: InsertUser

    lateinit var presenter: MainPresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        presenter = MainPresenter(mockResLocator, mockUserRepository)
        presenter.view = mockView
    }

    @Test
    fun `should add two values`() {

    }

    private fun givenAllStringsAreMocked() {
        whenever(mockResLocator.getString(R.string.tech_debt_is_paid)).thenReturn("Relax man, I pay my tech debt!")
    }
}
