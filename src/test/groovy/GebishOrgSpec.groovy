import geb.spock.GebReportingSpec
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testcontainers.containers.BrowserWebDriverContainer
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.Network
import spock.lang.Shared
import spock.lang.Title
import spock.lang.Subject
import spock.lang.Narrative
import spock.lang.Issue
@Title("Accessing Geb Documentation")
@Narrative("To visit the Geb Documentation the following steps have to be done. ")
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

    @Issue("http://my.issues.org/FOO-1")
    def "can get to the current Book of Geb"() {
        when: "Firstly visit the Geb Homepage"
        to GebishOrgHomePage
        report 'HomePage'

        and: "Open the Menue in the right upper corner"
        manualsMenu.open()
        report 'Open Menu'

        then: "Scroll to the First Link of the Menu"
        manualsMenu.links[0].text().startsWith("current")

        when: "Click the menu item"
        manualsMenu.links[0].click()

        then: "You will automatically be shon the book of Geb"
        at TheBookOfGebPage
        report 'book of Geb'
    }
}