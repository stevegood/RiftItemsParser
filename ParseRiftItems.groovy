import org.stevegood.rift.RiftItemSlurper

/**
 * User: stgood
 * Date: 1/9/14
 * Time: 11:35 AM
 *
 * Download and unzip the Items.xml file from Rift_Discoveries_{file_date} @ ftp://ftp.trionworlds.com/rift/data/
 *
 */

def start = new Date().time
def items = RiftItemSlurper.parse(new File('Items.xml'))
def end = new Date().time
println "${items.size()} items parsed in ${(end - start)/1000} seconds"
