
package es.voghdev.hellokotlin

import com.nhaarman.mockito_kotlin.whenever
import es.voghdev.hellokotlin.domain.ResLocator
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class MainPresenterTest {

    @Mock lateinit var mockResLocator: ResLocator

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `should add two values`() {

    }

    private fun givenAllStringsAreMocked() {
        whenever(mockResLocator.getString(R.string.tech_debt_is_paid)).thenReturn("Relax man, I pay my tech debt!")
    }
}
