import geb.spock.GebReportingSpec
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testcontainers.containers.BrowserWebDriverContainer
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.Network
import spock.lang.Shared
class GebishOrgSpec extends GebReportingSpec {

    @Shared
    Network network = Network.newNetwork();

    @Shared
    BrowserWebDriverContainer firefox = new BrowserWebDriverContainer()
            .withCapabilities(new FirefoxOptions())
            .withNetwork(network)

    def setupSpec() {
        firefox.start()

        println firefox.vncAddress
        browser.driver = firefox.webDriver
        baseUrl = "http://gebish.org"
    }

    def "can get to the current Book of Geb"() {
        when:
        to GebishOrgHomePage

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }
}